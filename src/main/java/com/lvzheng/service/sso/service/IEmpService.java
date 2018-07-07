package com.lvzheng.service.sso.service;

import com.lvzheng.service.sso.vo.EmploysVo;
import com.lvzheng.service.sso.vo.LogVo;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: hpb
 * @Date: 2018-07-05
 */
public interface IEmpService {
    /**
     * 查用户信息
     * @param loginname
     * @param password
     * @return
     * @throws Exception
     */
    EmploysVo getloginEntity(String loginname,String password)throws Exception;

    /**
     * 防止自动化登录，检测规定时间内ip访问次数
     * @param request
     * @return
     * @throws Exception
     */
    boolean checkLoginIP(HttpServletRequest request)throws Exception;
    /**
     * 验证账户密码
     */
    boolean checkLoginPassword(String loginname,String password,EmploysVo employsVo);
    /**
     * 验证登录次数
     */
    boolean checkLoginCount(String token);
    /**
     * 验证验证码
     */
    int checkCaptcha(String captcha,String token);
}
