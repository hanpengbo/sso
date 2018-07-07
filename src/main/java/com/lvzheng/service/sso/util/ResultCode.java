package com.lvzheng.service.sso.util;

public enum ResultCode {

    SUCCESS(200, "成功"), FAIL(1, "失败"), PARAM_ERROR(2, "参数错误"), NO_VISIT_RIGHT(250, "无访问权限");

    private int code;
    private String message;

    private ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}