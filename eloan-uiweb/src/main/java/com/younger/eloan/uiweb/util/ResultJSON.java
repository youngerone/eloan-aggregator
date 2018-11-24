package com.younger.eloan.uiweb.util;

/**
 * 结果返回
 */
public class ResultJSON {

    private boolean success;

    private Object msg;

    private int errCode;


    public ResultJSON(){}

    public ResultJSON(boolean success){
        this.success=success;
    }

    public ResultJSON(Object msg,int errCode){
        this.msg=msg;
        this.errCode=errCode;
    }

    public ResultJSON(boolean success,Object msg){
        this.success=success;
        this.msg=msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}
