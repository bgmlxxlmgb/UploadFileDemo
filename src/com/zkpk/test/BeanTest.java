package com.zkpk.test;

import com.zkpk.beans.HelloWorldBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2016/10/17.
 */
public class BeanTest {
    public static void  main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldBean hwb = (HelloWorldBean)context.getBean("helloWorldBean");
        hwb.sayHelloWorld();
    }
}
