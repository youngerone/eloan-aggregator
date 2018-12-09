package com.younger.eloan.basice.service;

import com.younger.eloan.basice.query.IpLogQueryObject;
import com.younger.eloan.basice.query.PageResult;

/**
 * 日志业务处理
 */
public interface IIpLogService {
    /**
     * 分页查询
     * @param queryObject
     * @return
     */
    PageResult query(IpLogQueryObject queryObject);
}
