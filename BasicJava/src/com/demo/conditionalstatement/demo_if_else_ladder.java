package com.demo.conditionalstatement;

public class demo_if_else_ladder {

	public static void main(String[] args) {
		int marks=59;
		
		if(marks>=65) {
			System.out.println("gradeA");
		}
		else if(marks<65 && marks>=55) {
			System.out.println("gradeB");
		}
		else if(marks<55 && marks>=35) {
			System.out.println("gradeC");
		}
		else {
			System.out.println("gradeD");
		}

	}

}
