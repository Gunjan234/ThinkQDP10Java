package com.demo.loop;

public class PatternA1 {

	
		// TODO Auto-generated method stub
		public static void printPattern(int rows) {
			int i,j;
			for(i=1;i<=rows;i++) {
				for(j=1;j<=i;j++) {
					System.out.print("1");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			printPattern(5);

	}

}
