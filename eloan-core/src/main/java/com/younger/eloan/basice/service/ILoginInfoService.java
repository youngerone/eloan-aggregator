package com.younger.eloan.basice.service;

/**
 * 前台用户注册
 */
public interface ILoginInfoService {

    void register(String userName,String pwd);

    /**
     * 验证用户名是否存在
     * @param name
     * @return
     */
    boolean checkUserName(String name);
}
