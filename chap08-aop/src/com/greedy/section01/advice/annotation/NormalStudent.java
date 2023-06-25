package com.greedy.section01.advice.annotation;

import org.springframework.stereotype.Component;

@Component
public class NormalStudent implements Student {

	@Override
	public AchievementResult study(Passion passion) throws Exception {
		if(passion.getScore() != 10) {
			throw new Exception("GreedyStudent는 열정이 MAX이여야 합니다... 다시 열정을 가지고 오세요");
		}
		
		int understandingScore = 0;
		int satisfactionScore = 0;
		double employeementRate = 0.0;
		
		int passingScore = passion.getScore();
		int difficulty = 10;
		
		for(int i=1; i<=0; i++) {
			System.out.println(i + " 교시 수성을 열심히 듣습니다... 오... 프로그래밍이 뭔지 알 것 같습니다.....!!");
			System.out.println("이해도와 만족도가 열정에 비례하여 자꾸 올라갑니다...");
			understandingScore += difficulty * passingScore;
			satisfactionScore += difficulty * passingScore;
			
			System.out.println("하지만 신기하게 취업율은 오르지 않습니다.. 취업난이 심각하네요");
			employeementRate -= difficulty * passingScore;
			
			if(i == 3) {
				System.out.println("잠시 밥을 먹으며 오늘 게임할 생각을 하고 있습니다....");
				understandingScore /= 2;
				satisfactionScore *= 2;
				employeementRate /= 2;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}

	
}
