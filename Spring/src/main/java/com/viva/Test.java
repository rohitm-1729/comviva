package com.viva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// Constructor Injection
//		B b = new B();
//		A a = new A(b);
		
		// Setter Injecton
//		B b = new B();
//		A a = new A();
//		a.setB(b);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		for( String beanName : context.getBeanDefinitionNames())
		{
			System.out.println(beanName);
		}
		
//		A a = (A)context.getBean("a");
//		a.execute();
		
//		PaymentService service = (PaymentService)context.getBean("paymentService");
		PaymentService service = context.getBean(PaymentService.class);
		service.execute();
		
		
		
		
		
		
		
		

	}

}
