package com.demo.conditionalstatement;
import java.util.*;
public class Scanner2 {

	public static void main(String[] args) {
		//scanner class is used to take input from keyboard
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter x");
		int x=sc.nextInt();
		
		System.out.println("enter y");
		int y=sc.nextInt();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter height");
		float h=sc.nextFloat();
		
		System.out.println("enter wt");
		double w=sc.nextDouble();
		
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("name="+name);
		System.out.println("height="+h);
		System.out.println("wt="+w);
		System.out.println("character="+ch);
		
		
	System.out.println("sum is..."+(x+y));	
	}

}
