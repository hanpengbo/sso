package com.lvzheng.service.sso.constant;

/**
 * @Author: hpb
 * @Date: 2018-07-07
 */
public class Constant {
    /**
     * 登录限制 redis 前缀
     * LOGIN_LIMIT ip前缀
     * LOGIN_CAPTCHA  captcha前缀
     */
    public static final String LOGIN_LIMIT = "login_limit_";
    public static final String LOGIN_CAPTCHA = "login_captcha_";
    public static final String LOGIN_ERROR_TIMES = "login_error_times_";
}
