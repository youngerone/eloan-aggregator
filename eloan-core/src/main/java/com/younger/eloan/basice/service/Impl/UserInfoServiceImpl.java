package com.younger.eloan.basice.service.Impl;

import com.younger.eloan.basice.domain.Userinfo;
import com.younger.eloan.basice.mapper.UserinfoMapper;
import com.younger.eloan.basice.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息
 */
@Service("userInfoService")
public class UserInfoServiceImpl  implements IUserInfoService{

    @Autowired
    private UserinfoMapper userinfoMapper;
    /**
     * 获取用户
     * @param id
     * @return
     */
    @Override
    public Userinfo getUserInfo(Long id) {
        Userinfo userinfo = userinfoMapper.selectByPrimaryKey(id);
        return userinfo;
    }
}
