package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

import com.greedy.section01.advice.xmlconfig.Passion;


public class BeforeAttendingAdvice {
	
	public void beforeAttending(JoinPoint joinPoint) {
		System.out.println("=========================== before attending ==================================");
		System.out.println("���õ� �ų��� ����ؼ� �Խ� ī�带 ��´�.");
		System.out.println("������ Ÿ�� : " + joinPoint.getTarget().getClass());		//Ÿ�� Ŭ������ ����
		System.out.println("�������� ���� : " + joinPoint.getSignature());				//����Ÿ���� ������ �ñ״�ó
		System.out.println("���� ��� : " + joinPoint.getSignature().getName());		//�޼ҵ��� �̸��� ��ȯ
		System.out.println("�������� ���� : " + ((Passion) joinPoint.getArgs()[0]).getScore());
		System.out.println("===============================================================================");
	}

}
