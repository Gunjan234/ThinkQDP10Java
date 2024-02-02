package com.demo.loop;

public class PatternA5 {
	public static void printPattern(int row) {
	int i,j;
	for(i=4;i>=1;i--) {
		for(j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	printPattern(4);
}

	

}
