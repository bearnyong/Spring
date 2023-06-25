package com.greedy.section01.properties.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.greedy.section01.properties.javaconfig.config.ContextConfiguration;


public class Application {

	public static void main(String[] args) {
		
		/*실습 문제. getItem을 하였을 때 제품의 이르이 나오도록 변경하여라*/
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/properties/xmlconfig/config/spring-context.xml");
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for (String string : beanNames) {
			System.out.println(string);
		}
		
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
		cart1.addItem(milk);
		cart1.addItem(carpBread);
		
		cart1.getItem("soim");
		
		ShoppingCart cart2 = context.getBean(ShoppingCart.class);
		cart2.addItem(water);
		cart2.addItem(carpBread);
		cart2.addItem(milk);
		
		cart2.getItem("minyoung");
		
		/*아래의 두 인스턴스의 주소값이 다르다는 것은 개별 객체를 의미한다.*/
		System.out.println();
		System.out.println("soim : " + cart1.hashCode());
		System.out.println("minyoung : " + cart2.hashCode());
		
	}

}
