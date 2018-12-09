package com.younger.eloan.basice.service.Impl;

import com.younger.eloan.basice.domain.Iplog;
import com.younger.eloan.basice.mapper.IplogMapper;
import com.younger.eloan.basice.query.IpLogQueryObject;
import com.younger.eloan.basice.query.PageResult;
import com.younger.eloan.basice.service.IIpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 登录日志信息查询
 */
@Service("ipLogService")
public class IpLogServiceImpl implements IIpLogService {

    @Autowired
    private IplogMapper iplogMapper;
    /**
     * 登录日志信息查询
     * @param queryObject
     * @return
     */
    @Override
    public PageResult query(IpLogQueryObject  queryObject) {

        int totalCount = iplogMapper.queryForCount(queryObject);
        if(totalCount>0){
            List<Iplog> list = iplogMapper.query(queryObject);
            return new PageResult(list,queryObject.getCurrentPage(), totalCount, queryObject.getPageSize());
        }
        return PageResult.empty(queryObject.getPageSize());
    }
}
