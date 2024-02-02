package com.demo.conditionalstatement;
import java.util.*;
public class Demo_ifElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num%5==0) {
			System.out.println("hello!");
		}
		else if(num%3==0) {
			System.out.println("welcome");
		}
		else if(num%6==0) {
			System.out.println("good morning");
		}

	}

}
