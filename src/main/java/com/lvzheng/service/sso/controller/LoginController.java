package com.lvzheng.service.sso.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.lvzheng.service.sso.config.KaptchaConfig;
import com.lvzheng.service.sso.constant.Constant;
import com.lvzheng.service.sso.service.IEmpService;
import com.lvzheng.service.sso.util.JSONResult;
import com.lvzheng.service.sso.util.LoginUtil;
import com.lvzheng.service.sso.util.ResultUtil;
import com.lvzheng.service.sso.vo.EmploysVo;
import com.lvzheng.service.sso.vo.LogVo;
import com.lvzheng.service.sso.vo.LoginVo;
import com.lvzheng.service.sso.wapper.RedisWapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;


import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * @Author: hpb
 * @Date: 2018-07-05
 */
@RestController
@RequestMapping("/emp")
public class LoginController {
    @Autowired
    private IEmpService empService;
    @Autowired
    private DefaultKaptcha producer;
    @Resource
    private RedisWapper redisWapper;

    @Value("${login.default.url}")
    private String defaultUrl;

    @Value("${login.redis.captcha.expire}")
    private Long captchaExpire;

    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    /**
     * 获取用户cookie
     * @param request
     * @return
     */
   @RequestMapping("/getEmpCookie")
   public JSONResult checkLogin(HttpServletRequest request, HttpServletResponse response, LoginVo loginVo) {
       logger.info("登录访问参数："+JSON.toJSONString(loginVo));
       //验证token
       int captcha1 = empService.checkCaptcha(loginVo.getCaptcha(), loginVo.getToken());
       if(captcha1 == 2){return ResultUtil.error("验证码错误");}
       //1登录账号及密码不能为空
       if(loginVo.getLogname()!=null && loginVo.getLogname()!="" && loginVo.getPassword() !=null && loginVo.getPassword() !=""){
           EmploysVo checkelogin = null;
           try {
               //2登录用户ip的访问限制
               boolean b = empService.checkLoginIP(request);
               if(!b){
                  return ResultUtil.error("您访问过于频繁，请稍后重试");
               }
               //3查询用户实体
               checkelogin  = empService.getloginEntity(loginVo.getLogname(),loginVo.getPassword());
           } catch (Exception e) {
               e.printStackTrace();
               logger.error("获取用户信息失败，登录名:"+loginVo.getLogname());
               return ResultUtil.error("获取用户信息失败");
           }
           if(checkelogin!=null){
               //4检查密码  这一步单独提出来是因为验证码需要验证
               boolean b = empService.checkLoginPassword(loginVo.getLogname(), loginVo.getPassword(), checkelogin);
               if(b) {
                   //5 生成cookie
                   Cookie loginCookie = LoginUtil.getLoginCookie(checkelogin.getEmpid(), loginVo.getLogname(), request);
                   response.addCookie(loginCookie);
                   try {
                       if (loginVo.getCallback() == null || loginVo.getCallback().equals("")) {
                           loginVo.setCallback(defaultUrl) ;
                       }
                       response.sendRedirect(loginVo.getCallback());
                   } catch (IOException e) {
                       e.printStackTrace();
                       logger.error("跳转页面失败："+e.getMessage());
                   }
                   logger.info("登录成功 获取cookie:"+JSON.toJSONString(loginCookie));
                   return ResultUtil.success(loginCookie);
               }{
                   //6查看密码在规定时间内登录错误的次数
                   if(empService.checkLoginCount(loginVo.getToken())){
                       return ResultUtil.error(102,"弹出验证码");
                   }
                   return ResultUtil.error(101,"密码错误！");
               }
           }else {
               return ResultUtil.error("无用户信息");
           }
       }else {
           return ResultUtil.error("登录名或密码不能为空");
       }
   }

    /**
     * 生成图片验证码
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(value = "/captcha", method = RequestMethod.GET)
    public JSONResult captcha(HttpServletResponse response) throws ServletException, IOException {
        //生成一个token 用于标识验证码的唯一标识
        String token = UUID.randomUUID().toString();
        logger.info("生成token:"+token);
        // 生成文字验证码
        String text = producer.createText();
        logger.info("生成验证码："+text);
        //验证码存redis 并设置过期时间
        String key = Constant.LOGIN_CAPTCHA + token;
        redisWapper.addCache(key, text, captchaExpire);
        // 生成图片验证码
        ByteArrayOutputStream outputStream = null;
        BufferedImage image = producer.createImage(text);
        outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 生成captcha的map
        Map<String, Object> map = new HashMap<>();
        String encode = encoder.encode(outputStream.toByteArray());
        String s = encode.replaceAll("\r\n", "");
        System.out.println(s);
        map.put("img", "data:image/jpeg;base64," + s);
        map.put("token",token);
        return ResultUtil.success(map);
    }

    @RequestMapping(value = "/captcha1", method = RequestMethod.GET)
    public void captcha1(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        // 生成文字验证码
        String text = producer.createText();
        System.out.println(text);
        // 生成图片验证码
        ServletOutputStream outputStream = null;
        BufferedImage image = producer.createImage(text);
        outputStream = response.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            outputStream.flush();
        }finally {
            outputStream.close();
        }
    }
}
