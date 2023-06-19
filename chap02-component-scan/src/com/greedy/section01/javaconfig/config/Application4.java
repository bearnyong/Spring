package com.greedy.section01.javaconfig.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.MemberDAO;
import com.greedy.section01.javaconfig.MemberDTO;

public class Application4 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.greedy.section01.javaconfig", "com.greedy.section01.javaconfig.config");
		
		String[] beans = context.getBeanDefinitionNames();
		for(String string : beans) {
			System.out.println(string);
		}
		
		MemberDAO memberDAO = context.getBean(MemberDAO.class);
		
		System.out.println(memberDAO.selectMember(1));
		System.out.println(memberDAO.insertMember(new MemberDTO(3,"이름","남","010-1234-5678")));
		System.out.println(memberDAO.selectMember(3));

	}

}
