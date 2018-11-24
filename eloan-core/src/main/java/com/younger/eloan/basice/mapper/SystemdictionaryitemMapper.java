package com.younger.eloan.basice.mapper;

import com.younger.eloan.basice.domain.Systemdictionaryitem;
import java.util.List;

public interface SystemdictionaryitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionaryitem record);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    List<Systemdictionaryitem> selectAll();

    int updateByPrimaryKey(Systemdictionaryitem record);
}