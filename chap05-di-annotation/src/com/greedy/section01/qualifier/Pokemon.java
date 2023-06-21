package com.greedy.section01.qualifier;

import org.springframework.stereotype.Component;

public interface Pokemon {
	
	void attack();
	
}



// ------- 다른 클래스... (노션 정리용)...

@Component //bean에서 관리하는 설정 파일로 등록하겠다는 의미
public class Charmander1 implements Pokemon {
	@Override
	void attack() {
		System.out.println("몸통");
	}
}

public class Pikachu1 implements Pokemon {
	@Override
	void attack() {
		System.out.println("몸통");
	}
}