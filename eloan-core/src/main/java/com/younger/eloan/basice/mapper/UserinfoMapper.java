package com.younger.eloan.basice.mapper;

import com.younger.eloan.basice.domain.Userinfo;
import java.util.List;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userinfo record);

    Userinfo selectByPrimaryKey(Long id);

    List<Userinfo> selectAll();

    int updateByPrimaryKey(Userinfo record);
}