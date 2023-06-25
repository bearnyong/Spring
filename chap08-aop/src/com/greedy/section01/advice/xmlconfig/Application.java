package com.greedy.section01.advice.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {

	
		/* 먼저 Student 인터페이스를 추가한다. */
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/advice/xmlconfig/config/spring-context.xml");
		
	
		Student normalStudent = context.getBean("normalStudent", Student.class);
		
		System.out.println("============= NormalStudent ================");
		AchievementResult normalResult = normalStudent.study(new Passion(10));
		System.out.println("NormalStudent Result : " + normalResult);
		
		Student greedyStudent = context.getBean("greedyStudent", Student.class);
		
		System.out.println("============= GreedyStudent ================");
		AchievementResult greedyResult = greedyStudent.study(new Passion(10));
		System.out.println("GreedyStudent Result : " + greedyResult);
		
	}


}
