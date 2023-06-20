package com.greedy.section01.xmlconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.greedy.section01.javaconfig.Account;
import com.greedy.section01.javaconfig.MemberDTO;
import com.greedy.section01.javaconfig.PersonalAccount;

@Configuration
public class ContextConfiguration1 {
	
	@Bean
	public Account accountGenerator() {
		return new PersonalAccount(20, "110-222-123456", "1234");
	}
	
	@Bean
	public MemberDTO memberGenerator() {
		MemberDTO member = new MemberDTO();
		Account account = accountGenerator();
		
		member.setSequence(1);
		member.setName("이단비");
		member.setPhone("010-5235-7894");
		member.setEmail("dkfjajf@naver.com");
		member.setPersonalAccount(account);
		
		return member;
	}
}

/* container가 bean들을 생성할 떄 의존관계에 있는 다른 bean을 먼저 생성 후에 조합시 사용한다
 * 이런 것을 의존관계 주입 혹은 의존성 주입이라고 한다.
 * 
 * 의존성 주입은 광범위한 역제어 테크닉의 한 형태이다.
 * 어떤 서비스를 호출하려는 클라이언트는 그 서비스가 어떻게 구성되었는지 알지 못해야 한다.
 * 클라이언트는 대신 서비스 제공에 대한 책임을 외부 코드(주입자)로 위임한다.
 * 클라이언트는 주입자 코드를 호출할 수 없다. 그 다음, 주입자는 이밎 존재하거나 주입자에 의해 구성되었을 서비스를 클라이언트로 주입(전달)한다.
 * 그리고나서 클라이언트는 서비스를 사용한다. 이는 클라이언트가 주입자와 서비스 구성 방식 또는 사용중인 실제 서비스에 대해 알 필요가 없을음 의미한다.
 * 클라이언트는 서비스의 사용 방식을 정의하고 있는 서비스의 고유한 인터페이스에 대해서만 알면 된다.
 * 
 * 디자인 변경이나 결합의 영향으로부터 클라이언트를 독립하는 도움을 주며, 이는 재사용성, 테스트가능성, 유지가능성을 향상시킨다.*/
