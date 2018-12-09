package com.younger.eloan.basice.service.Impl;

import com.younger.eloan.basice.domain.Account;
import com.younger.eloan.basice.mapper.AccountMapper;
import com.younger.eloan.basice.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 获取账户
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;
    /**
     * 获取账户信息
     * @param id
     * @return
     */
    @Override
    public Account getAccount(Long id) {
        Account account = accountMapper.selectByPrimaryKey(id);
        return account;
    }
}
