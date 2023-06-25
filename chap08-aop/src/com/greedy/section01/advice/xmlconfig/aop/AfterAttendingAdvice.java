package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

import com.greedy.section01.advice.xmlconfig.Passion;


public class AfterAttendingAdvice {

	public void afterAttending(JoinPoint joinPoint) {
		System.out.println("=========================== after attending ==================================");
		System.out.println("���ϵ� �п��� ���� ������ �����ؾ���!! ��� �������� ���ڸ��� ��ϴ�.");
		System.out.println("������ Ÿ�� : " + joinPoint.getTarget().getClass());		//Ÿ�� Ŭ������ ����
		System.out.println("�������� ���� : " + joinPoint.getSignature());				//����Ÿ���� ������ �ñ״�ó
		System.out.println("���� ��� : " + joinPoint.getSignature().getName());		//�޼ҵ��� �̸��� ��ȯ
		System.out.println("�������� ���� : " + ((Passion) joinPoint.getArgs()[0]).getScore());

	}
}
