package com.greedy.section01.advice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.advice.annotation.Student;

public class Application {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.advice.annotation");
		
//		String[] beanNames = context.getBeanDefinitionNames();
//		for (String string : beanNames) {
//			System.out.println(string);
//		}
		
		Student normalStudent = context.getBean("normalStudent", Student.class);
		System.out.println("=========== Normal Student ==========");
		AchievementResult normalResult = normalStudent.study(new Passion(10));
		System.out.println("Nomal Student Result : " + normalResult);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Student greedyStudent = context.getBean("greedyStudent", Student.class);
		System.out.println("=========== greedy Student ==========");
		AchievementResult greedyResult = greedyStudent.study(new Passion(10));
		System.out.println("GreedyStudent Result : " + greedyResult);
		
	}

}
