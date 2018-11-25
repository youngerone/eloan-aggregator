package com.younger.eloan.basice.mapper;

import com.younger.eloan.basice.domain.Logininfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogininfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    List<Logininfo> selectAll();

    int updateByPrimaryKey(Logininfo record);

    int selectCountByUserName(@Param("username") String username,@Param("usertype") int usertype);

    Logininfo selectByUserNameAndPassword(@Param("username") String username, @Param("password") String password,@Param("usertype") int usertype);

    int selectUserTypeCount(@Param("userType") int userType);
}