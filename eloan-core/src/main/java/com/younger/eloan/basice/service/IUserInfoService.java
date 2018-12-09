package com.younger.eloan.basice.service;

import com.younger.eloan.basice.domain.Userinfo;

public interface IUserInfoService {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    Userinfo getUserInfo(Long id);
}
