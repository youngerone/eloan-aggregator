package com.younger.eloan.basice.service;

import com.younger.eloan.basice.domain.Logininfo;

/**
 * 前台用户注册
 */
public interface ILoginInfoService {

    void register(String userName,String pwd,int userType);

    /**
     * 验证用户名是否存在
     * @param name
     * @return
     */
    boolean checkUserName(String name,int userType);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public Logininfo login(String username,String password,int userType);

    /**
     * 判断是否有系统管理员用户
     * @return
     */
    public boolean hasAdminUser();

    /**
     * 创建系统管理员账号
     */
    public void createDefaultAdmin();
}
