package com.greedy.section01.advice.xmlconfig;

import org.springframework.stereotype.Component;

@Component
public class NormalStudent implements Student {

	@Override
	public AchievementResult study(Passion passion) throws Exception {
		
		if(passion.getScore() <= 0) {
			throw new Exception("������ �����մϴ�! �ٽ� ������ ������ ������!");
		}
		
		int understandingScore = 0;					//���ص�
		int satisfactionScore = 0;					//������
		double employeementRate = 0.0;				//�����
		
		int passionScore = passion.getScore();		//��������
		
		int difficulty = 5;							//���̵�
		for(int i = 1; i <= 8; i++) {
			System.out.println(i + "���� ������ ������ ����ϴ�. ��~ ���α׷����� ���� �� �� �����ϴ�!");
			System.out.println("���ص��� �������� ������ ����Ͽ� �ڲ� �ö󰩴ϴ�.");
			understandingScore += difficulty + passionScore;
			satisfactionScore += difficulty + passionScore;
			
			System.out.println("������ �ű��ϰ� ������� �������� ������ �ʽ��ϴ�. ������� �ɰ��Ѱ� ���ϴ�.");
			employeementRate += difficulty + passionScore;
			
			if(i == 3) {
				System.out.println("���� �Խ��ϴ�. ���� ���� �籸�忡�� ¥�������~ ��Ʈ������ Ǯ���ϴ�.");
				System.out.println("�� �籸�� ��! �ڹ� ���� �ؾ����!!");
				
				/* �籸�� ������ ���, ���ص��� ������� �������� �϶������� ��������� �����ϱ� ������ �������� �� ��� �����մϴ�. */
				understandingScore /= 2;
				satisfactionScore *= 2;
				employeementRate /= 2;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}

}
