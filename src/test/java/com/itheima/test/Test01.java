package com.itheima.test;

import com.itheima.entity.Account;
import com.itheima.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
        //创建容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IAccountService对象
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        //调用对象方法
        accountService.save(new Account(95279527,11,999.0,3.14));
        
        System.out.println("1111");
    }
}

