package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class Client {
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	CalculatorService cs=(CalculatorService) ctx.getBean("service");
	System.out.println(cs.hashCode());
	CalculatorService cs2=(CalculatorService) ctx.getBean("service");
	System.out.println(cs2.hashCode());
	
	ctx.close();
}
}
