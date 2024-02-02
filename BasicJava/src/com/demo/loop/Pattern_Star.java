package com.demo.loop;

public class Pattern_Star {

	public static void printPattern(int rows) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=4;i>=1;i--) {
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[]args) {
		printPattern(4);
	}
}
