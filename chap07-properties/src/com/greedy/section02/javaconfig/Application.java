package com.greedy.section02.javaconfig;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section02.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		
		  /*  i18n 소프트웨어의 국제화 (Internationalization에서 첫 글자인 I와 마지막 글자인 N 사이 알파벳 개수가 18개)
	       *  (국제화 말고 현지화도 있음 (Localization : 현지화))
	       *  어떤 프레임 워크를 지칭하는 것이 아닌 I와 N사이에 알파벳이 18개라는 뜻이다.
	       *  
	       *  소프트웨어를 국제화 하기 위해서 처리해야 할 작업이 많다.
	       *  1. 언어, 지역별 번역
	       *  2. os/플랫폼 인코딩
	       *  3. 문자열 치환 방법 : 서버쪽, 클라이언트쪽 치환 중 서버쪽에서 하는게 좋다(경우에 따라 다르다) 사용자 디바이스에 리소를 및 랜더링 성능 이슈 발생
	       *  4. 국제화 UI (문자열 크기 변화, 폰트, 아이콘 등)
	       *  5. 쓰기 방향의 차이
	       *  6. 숫자, 공백, 화폐, 날짜, 주소, 측정 단위 등
	       *  7. 타입존, 섬머타임 등 시각
	       *  8. 문자열 정렬 방법
	       *  
	       *  그 중 1번에 해당하는 다국어 메세지를 처리하는 방법을 실습해 본것이다.
	       * */
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		String error404 = context.getMessage("error.404", null, Locale.US);
		String error500 = context.getMessage("error.500", new Object[] {"kim", new Date()}, Locale.KOREA);
		
		System.out.println(error404);
		System.out.println(error500);
		

	}

}
