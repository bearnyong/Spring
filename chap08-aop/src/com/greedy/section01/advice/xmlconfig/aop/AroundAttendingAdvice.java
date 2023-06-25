package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

import com.greedy.section01.advice.annotation.GreedyStudent;

public class AroundAttendingAdvice {

	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("============================= around attending before ================================");
		System.out.println("���õ� �п��� ���� ������ �����ؾ���!! ��� �������� ��ħ ���� �Ͼ�ϴ�.");
		System.out.println("======================================================================================");
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object result = joinPoint.proceed();
		
		System.out.println("============================= around attending after ================================");
		
		if(joinPoint.getTarget() instanceof GreedyStudent) {
			System.out.println("������ ������ �п��� ���� �� ������ ������ �ƴմϴ�. ������ ���͵� �׷�� �Բ� �ٽ� �����մϴ�!! ");
		}
		
		System.out.println("������ ���������� ��� ī�带 ��´�.");
		
		stopWatch.stop();
		
		System.out.println("�� ���� �ҿ� �ð� : " + stopWatch.getTotalTimeMillis() + "(ms)");
		System.out.println("======================================================================================");
		
		return result;
	}

}
