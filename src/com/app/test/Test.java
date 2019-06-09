package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Order;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		Object obj= ac.getBean("ordObj");
		Order o= (Order)obj;
		System.out.println(o);

	}

}
