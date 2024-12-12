package com.pack1;

public class Calc {
	//Default scope
	int x = 10;
	
	//Private scope=only within class
	private int y = 20;
		
	//Default scope
	void findSquare(int num) {
		System.out.println(num * num);
	}
	
	private void findCube(int num) {
		System.out.println(num * num * num);
	}
}
