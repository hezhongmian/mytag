package com.obaibai.www.propertie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatePropertyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-datetest.xml");
        DatePro datePro = (DatePro) ctx.getBean("datePro");
        System.out.println(datePro.getDate());
    }
}
