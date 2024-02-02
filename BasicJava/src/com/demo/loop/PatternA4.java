package com.demo.loop;

public class PatternA4 {


	public static void printPattern(int row) {
	int i,j;
	for(i=5;i>=1;i--) {
		for(j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	printPattern(5);

	}

}
