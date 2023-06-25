package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.greedy.section01.advice.annotation.GreedyStudent;

@Aspect
@Component
public class AroundAttendingAdvice {
	
	/* Around davice는 가장 강력한 어드바이스이다.
	 * 이 어드바이스는 조인 포인트를 완전히 장악하기 떄문에
	 * 앞에 살펴 본 어드바이스 모두 Around 어드바이스로 조합할 수 있다.
	 * 심지어 원본 조인포인트를 먼저 실행할지 실행자체를 안할지, 계속 실행할지의 여부까지도 제어한다.
	 * AroundAdvice의 조인포인트 매개변수는 Proceedingjoinpoint로 고정되어 있다.
	 * joinPoint의 하위 인터페이스로 원본 조인포인트의 진행 시점을 제어할 수 있다.
	 * 조인포인트 진행하는 호출을 잊는 경우가 자주 발생하기 때문에 주의해야 하며
	 * 최소한의 요건을 충족하면서도 가장 기능이 약한 어드바이스를 쓰는게 가장 바람직하다. */
	
//	@Around("execution(* com.greedy.section01.advice.annotation..*(..))")
	/* 동일한 클래스 내에서 사용하는 것이면 클래스명은 생략 가능하다. 단 패키지가 다르면 패키지를 포함한 클래스명을 기술해야 한다.*/
	@Around("AroundAttendingAdvice.studentAroundPointcut()")
	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("=============== around attending before ==============");
		System.out.println("오늘도 학원에서 열심히 공부해야지 마음을 먹습니다...");
		System.out.println("======================================================");
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//원본 조인포인트를 실행한다.
		Object result = joinPoint.proceed();
		System.out.println("============== around attending after ================");
		
		if(joinPoint.getTarget() instanceof GreedyStudent) {
			System.out.println("수업이 끝나도 학원이 닫을 때 까지는 끝난게 아닙니다. \n자율적으로 스터디를 합니다.");
		}
		
		System.out.println("열심히 공부를 했으니 퇴실 카드를 찍습니다.");
		stopWatch.stop();
		System.out.println("총 공부 소요시간 : " + stopWatch.getTotalTimeMillis()+"(ms)");
		System.out.println("=====================================================");
		
		return result;
	}
	
	/* 지금까지 포인트컷을 사용할 떄 하나하나 다 작성을 해줬다.
	 * 그러나 @Pointcut을 이용하면 포인트컷만 따로 정의해 여러 어드바이스에서 재사용할 수 있다.
	 * 포인트컷과 애플리이션 로직이 뒤섞이는 것은 바람직하지 않기 때문이다.
	 * 메소드 바딜ㄹ 비운 포인트컷의 접근 제한자를 통하여 포인트컷 사용 범위를 지정하낟.
	 * 이렇게 선언한 포인트 컷은 다른 어드바이스가 메소드명으로 참조한다.*/
	
	/* 포인트컷은 void형 메소드로 작성하고 표현식으 ㄹ작성한 뒤 메소드 이름이 포인트컷의 이름이 된다.*/
	@Pointcut("execution(* com.greedy.section01.advice.annotation..*(..))")
	private void studentAroundPointcut() {}
	
}
