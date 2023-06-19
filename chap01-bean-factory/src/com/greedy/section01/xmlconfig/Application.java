package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* 우선 IOC 컨테이너라 불리는 존재의 최상위 인터페이스인 bean factory부터 살펴 볼 것이다.
		 * xml파일 bean 등록 =  IOC 컨테이너 어쩌구 확인하기
		 * 
		 * BeanFactory란?
		 * 스프링 컨테이너의 최상위 컨테이너이며, ApplicationContext와 함께 스프링 컨테이너라고 한다.
		 * Bean의 생성과 설정, 관리 등의 역할을 맡고 있다.
		 * */
		
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/spring-context.xml");
		// System.out.println(context.getBean("member"));
		
		/*스프링의 BeanFactory를 사용하지 않을 때*/
		MemberDTO member = new MemberDTO(1, "이름", "기본주소임", "상세주소임", 20, 'M');
		MemberDTO member0 = new MemberDTO(1, "이름", "기본주소임", "상세주소임", 20, 'M');
		/*이렇게 했을 때 DTO에서 수정된 부분을 호출한 부분마다 다 수정해줘야 하기 떄문에 아래 member1과 member2와 같은 방식으로 호출하여 유지보수성을 높여준다.*/
		
		/* MemberDTO 클래스를 만들어서 BeanFactory에 설정 정보를 이용하여 인스턴스를 인성하고 사용하는 예제를 만들었다.*/
		MemberDTO member1 = context.getBean("member", MemberDTO.class);
		MemberDTO member2 = context.getBean("member", MemberDTO.class);
		
		
		/*두 인스턴스가 동일한 주소값을 가지고 있으며 이는 싱글톤 패턴이다.*/
		System.out.println("member0 : " + member0.hashCode());
		System.out.println("member1 : " + member1.hashCode());
		System.out.println("member2 : " + member2.hashCode());
		System.out.println("========================");
		System.out.println(member1 == member0);
		System.out.println(member1 == member2);
	}

}
