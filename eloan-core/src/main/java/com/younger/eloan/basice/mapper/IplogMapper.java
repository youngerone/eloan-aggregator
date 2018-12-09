package com.younger.eloan.basice.mapper;

import com.younger.eloan.basice.domain.Iplog;
import com.younger.eloan.basice.query.IpLogQueryObject;

import java.util.List;

public interface IplogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Iplog record);

    Iplog selectByPrimaryKey(Long id);

    List<Iplog> selectAll();

    int updateByPrimaryKey(Iplog record);

    int queryForCount(IpLogQueryObject queryObject);

    List<Iplog> query(IpLogQueryObject queryObject);
}