package com.demo.loop;

public class Pattern_Pyramid {

	public static void showPattern(int n) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=n;i++) {
			//space
			for(k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			//*
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void main(String[]args) {
		showPattern(5);
	}
}
