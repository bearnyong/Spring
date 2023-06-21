package com.greedy.section01.singleton.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		//xml 방식에서 bean의 scope 설정에 대하여 알아본다
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/greedy/section01/singleton/xmlconfig/config/spring-context.xml");
		
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		Shoopingcard minyoung = context.getBean("cart", Shoopingcard.class);
		minyoung.addItem(milk);
		minyoung.addItem(carpBread);
		
		System.out.println("minyoung cart : ");
		minyoung.getItems();
		
		Shoopingcard jihwan = context.getBean("cart", Shoopingcard.class);
		
		jihwan.addItem(water);
		jihwan.addItem(water);
		jihwan.addItem(carpBread);
		
		System.out.println("jihwan cart : ");
		jihwan.getItems();
	}

}
