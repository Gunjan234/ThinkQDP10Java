package com.demo.conditionalstatement;
import java.util.*;
public class Scanner5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num>=0) {
			System.out.println(num+" is positive");
		}
		else
			System.out.println(num+" is negative");

	}

}
