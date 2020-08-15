package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;

public class IAccountDaoImpl implements IAccountDao {

    @Override
    public void save(Account account) {
        System.out.println("账户:"+account);
    }
}
