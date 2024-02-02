package com.demo.loop;

public class Test_continue_keyword {

	public static void printNo() {
		for(int i=1; i<=10;i++) {
			if(i==5)
				continue;
		}
	}
	public static void main(String[] args) {
		printNo();

	}

}
