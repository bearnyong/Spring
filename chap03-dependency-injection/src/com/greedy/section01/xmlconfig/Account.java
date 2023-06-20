package com.greedy.section01.xmlconfig;

/*추상 메소드*/
public interface Account {
	
	String getBalance();
	
	String deposit(int money);
	
	String withDraw(int money);
	
}
