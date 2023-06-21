package com.greedy.section01.singleton.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.singleton.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		
		//bean의 scope 설정에 대하여 알아본다
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(/*자바설정*/ContextConfiguration.class);
		
		String[] beanNames = context.getBeanDefinitionNames();
		for (String string : beanNames) {
			System.out.println(string);
		}
		
		/* 현재 빈 구성은 singleton으로 설정되어 있다. (기본값) 
		 * singleton은 IOC 컨테이너당 하나의 인스턴스만 생성한다.
		 * 
		 * 스프링의 빈 스코프
		 * Singleton 	 : IOC 컨테이너 당 빈 인스턴스를 하나 생성한다.
		 * Prototype 	 : 요청할 떄마다 빈 인스턴스를 새로 생성한다.
		 * requst 	 	 : HTTP 요청 당 하나의 빈 인스턴스를 생성한다. 웹 애플리케이션 컨덱스트에만 해당된다.
		 * session 	 	 : HTTP 세션당 빈 인스턴스 하나를 생성한다. 웹 애플리케이션 컨덱스트에만 해당된다.
		 * globalSession : 전역 HTTP세션당 빈 인스턴스 하나를 생성한다. 포털 애플리케이션 컨텍스트에만 해당된다.
		 * 
		 * 여기서 확인해 볼 내용은 손님 두 명이 각각 카드를 이용해 상품을 담았을 때
		 * singleton으로 관리되는 cart는 두 손님이 동일한 카드에 물건을 담게 된다. */

		
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		Shoopingcard minyoung = context.getBean("cart", Shoopingcard.class);
		minyoung.addItem(milk);
		minyoung.addItem(milk);
		minyoung.addItem(milk);
		minyoung.addItem(carpBread);
		minyoung.addItem(carpBread);
		
		System.out.println("minyoung cart : ");
		minyoung.getItems();
		
		Shoopingcard jihwan = context.getBean("cart", Shoopingcard.class);
		
		jihwan.addItem(water);
		jihwan.addItem(water);
		jihwan.addItem(water);
		jihwan.addItem(water);
		jihwan.addItem(water);
		jihwan.addItem(carpBread);
		
		System.out.println("jihwan cart : ");
		jihwan.getItems();
	}

}
