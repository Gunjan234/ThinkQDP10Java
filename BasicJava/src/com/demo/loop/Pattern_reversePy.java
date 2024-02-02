package com.demo.loop;

public class Pattern_reversePy {

	public static void showPattern(int n) {
		int i,j,k;
		for(i=n;i>=1;i--) {
			//space
			for(k=i;k<=n;k++) {
				System.out.print(" ");
			}
			//*
			for(j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void main(String[]args) {
		showPattern(5);
	

	}

}
