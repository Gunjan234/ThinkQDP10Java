package com.demo.loop;

public class PatternB5 {

	public static void printPattern(int row) {
	int i,j;
	for(i='a';i>='d';i--) {
		for(j='a';j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	printPattern(4);


	}

}
