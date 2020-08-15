package com.itheima.test;

import com.itheima.entity.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test(){
        //创建容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("SpEL.xml");
        //从容器中获取对象
        Account account = ac.getBean("account", Account.class);
        System.out.println("account = " + account);
    }
}
