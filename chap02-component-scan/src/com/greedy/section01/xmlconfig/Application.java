package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/config/spring-context1.xml");

		/*BeanNames을 출력*/
		String[] beanNames = context.getBeanDefinitionNames();/*bean뭐시기를 다 꺼내옴*/
		for (String string : beanNames) {
			System.out.println(string);
		}
		
		MemberDAO memberDAO = context.getBean(MemberDAO.class);
		System.out.println(memberDAO.selectMember(1));
		System.out.println(memberDAO.insertMember(new MemberDTO(3,"이순신","남","010-9876-5432")));
		System.out.println(memberDAO.selectMember(3));
	}

}
