package com.demo.loop;

public class PatternC1 {

	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPattern(4);

	}

}
