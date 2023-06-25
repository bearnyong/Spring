package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

import com.greedy.section01.advice.xmlconfig.AchievementResult;


public class AfterReturningAttendingAdvice {
	
	public void afterReturningAttending(JoinPoint joinPoint, Object result) {
		
		System.out.println("================= after returning attending =======");
		System.out.println("������ �Ϸ縦 �������ϰ� ��ħ~~~");
		System.out.println("������ ���ص� : " + (((AchievementResult) result).getUnderstandingScore()));
		System.out.println("������ ������ : " + (((AchievementResult) result).getSatisfactionScore()));
		
		double employeementRate = ((AchievementResult)result).getEmployeementRate();
		double percent = employeementRate / 1000.0 * 100;
		System.out.println("������ ����� : " + percent + " %");
		
		((AchievementResult) result).setEmployeementRate(percent);
		System.out.println("===================================================");
	}
}
