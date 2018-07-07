package com.lvzheng.service.sso.service.impl;

import com.lvzheng.jixiang.rpc.api.IEmployersService;
import com.lvzheng.jixiang.rpc.bean.EmployersEntity;
import com.lvzheng.service.sso.constant.Constant;
import com.lvzheng.service.sso.service.IEmpService;
import com.lvzheng.service.sso.util.KVMap;
import com.lvzheng.service.sso.util.LoginUtil;
import com.lvzheng.service.sso.vo.EmploysVo;
import com.lvzheng.service.sso.wapper.RedisWapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;


/**
 * @Author: hpb
 * @Date: 2018-07-05
 */
@Service
public class EmpServiceImpl implements IEmpService{


    @Resource(name = "employersService")
    private IEmployersService employersService;

    @Autowired
    private RedisWapper redisWapper;

    @Value("${login.redis.ip.time}")
    private Long ipTime;

    @Value("${login.redis.ip.count}")
    private Long ipCount;

    @Value("${login.redis.captcha.time}")
    private Long captchaTime;

    @Value("${login.redis.captcha.count}")
    private Long captchaCount;
    /**
     * 检查用户信息，有返回实体，没有返回null
     * @param loginName
     * @param password
     * @return
     * @throws Exception
     */
    @Override
    public EmploysVo getloginEntity(String loginName,String password) throws Exception {
        EmploysVo employsVo = null;
        if(loginName ==null || password == null){
            return null;
        }
        EmployersEntity loginEmp = employersService.getLoginEmp(loginName,null);
        employsVo = tranceEmpEntityTovo(loginEmp);
        return employsVo;
    }

    @Override
    public boolean checkLoginPassword(String loginname, String password, EmploysVo employsVo) {
        if(loginname ==null || password == null || employsVo == null){
            return false;
        }
        if(employsVo.getPhonenumber().equals(loginname) && employsVo.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkLoginIP(HttpServletRequest request) throws Exception {
        String ipAddr = LoginUtil.getIpAddr(request);
        if(ipAddr !=null){
            Long increment = redisWapper.increment(Constant.LOGIN_LIMIT + ipAddr, ipTime);
            if(increment>ipCount){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkLoginCount(String token) {
        if(token!=null){
            Long increment = redisWapper.increment(Constant.LOGIN_ERROR_TIMES + token, captchaTime);
            if(increment>captchaCount){
                return true;
            }
        }
        return false;
    }

    @Override
    public int checkCaptcha(String captcha, String token) {
        if(captcha == null || token == null){
            return 0;
        }
        String cache = redisWapper.getCache(Constant.LOGIN_CAPTCHA + token);
        if(cache == null){
            return 1;
        }
        if(!cache.equals(captcha)){
            return 2;
        }else {
            return 3;
        }
    }

    public EmploysVo tranceEmpEntityTovo(EmployersEntity ee) {
        // TODO Auto-generated method stub
        EmploysVo vo = new EmploysVo();
        if(ee != null){
            vo.setActiontimes(ee.getActiontime());
            vo.setAddip(ee.getRegip());
            vo.setCaree(KVMap.careemap.get(ee.getEmptype()+"")+"");
            vo.setAddress(ee.getAddress());
            SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
            vo.setAddtime(sd.format(ee.getCreatetime()));
            vo.setBornyear(ee.getEmpbornyear());
            vo.setCareeid(ee.getEmptype());
            vo.setCityid((int) ee.getServicecity());
            vo.setServiceids(ee.getServicelocal());
            vo.setEmail(ee.getEmail());
            vo.setActiontimes(ee.getActiontime());
            vo.setEmpid(ee.getEmpid());
            vo.setEmpname(ee.getEmpname());
            vo.setGender(ee.getGender());
            vo.setPhonenumber(ee.getPhonenumber());
            vo.setRealname(ee.getRealname());
            vo.setOpenid(ee.getOpenid());
            vo.setPassword(ee.getPassword());
            vo.setJiedanstatus(ee.getJiedanstatus());
            vo.setCallusername(ee.getCallusername());
            vo.setCalluserpass(ee.getCalluserpass());
            vo.setCalllogintype(ee.getCalllogintype());
            vo.setRoleids(ee.getRoleids());
        }
        return vo;
    }
}
