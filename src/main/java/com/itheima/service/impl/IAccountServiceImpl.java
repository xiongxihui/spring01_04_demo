package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import com.itheima.service.IAccountService;

public class IAccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
