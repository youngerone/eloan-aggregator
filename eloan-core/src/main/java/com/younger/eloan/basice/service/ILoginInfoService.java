package com.younger.eloan.basice.service;

import com.younger.eloan.basice.domain.Logininfo;

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

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public Logininfo login(String username,String password);
}
