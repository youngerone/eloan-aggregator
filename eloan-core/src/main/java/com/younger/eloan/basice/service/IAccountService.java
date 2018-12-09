package com.younger.eloan.basice.service;

import com.younger.eloan.basice.domain.Account;

public interface IAccountService {

    /**
     * 根据Id获取账户
     * @param id
     * @return
     */
    Account getAccount(Long id);
}
