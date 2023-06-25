package com.greedy.section01.advice.annotation;

import org.springframework.stereotype.Component;

@Component
public class GreedyStudent implements Student {

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
			System.out.println(i + " 교시 수성을 열심히 듣습니다... 하지만 너무 어렵습니다...");
			System.out.println("이해도와 만족도가 열정에 비례하여 자꾸 떨어집니다...");
			understandingScore -= difficulty * passingScore;
			satisfactionScore -= difficulty * passingScore;
			
			System.out.println("하지만 신기하게 취업율은 올라가고 있습니다...?");
			employeementRate += difficulty * passingScore;
			
			if(i == 3) {
				System.out.println("잠시 반을 먹으며 오전에 수업 들은 내용을 토론합니다...");
				employeementRate += difficulty * passingScore;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}
	
	

}
