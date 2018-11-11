package com.younger.eloan.basice.util;

/**
 * 自定义异常
 */
public class LogicException extends  RuntimeException {

    /**
     * 异常错误码,类似于http响应的状态码，比如404代表（页面没有找到）
     * 101代表用户名不存在，102代表密码错误；
     */

    private int errCode;

    public  LogicException(String message){
        super(message);
    }

    public LogicException (String message,int errCode){
        super(message);
        this.errCode=errCode;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}
