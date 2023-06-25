package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.Passion;

@Aspect
@Component
public class AfterAttendingAdvice {
	
	/*after의 경우 조금 더 세분화하여 afterReturning과 afterThrowing으로 처리할 수 있다.
	 * 성공적으로 반환한 경우와 Exception이 던져진 경우 요청을 가로챈 후 처리를 할 때 사용한다.*/

   @After("execution(* com.greedy.section01.advice.annotation..*(..))")
   public void afterAttending(JoinPoint joinPoint) {
      System.out.println("================== after attending ==============");
      System.out.println("내일도 학원에서 열심히 공부한다는 마인드로 잠자리에 든다.");
      System.out.println("수강생의 타입 : " + joinPoint.getTarget().getClass());
      System.out.println("수강생의 행위 : " + joinPoint.getSignature());
      System.out.println("행위 요약  : " + joinPoint.getSignature().getName());
      System.out.println("수강생의 열정 : " + ((Passion) joinPoint.getArgs()[0]).getScore());
      System.out.println("==================================================");
   }
}