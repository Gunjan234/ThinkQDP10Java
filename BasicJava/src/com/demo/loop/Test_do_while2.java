package com.demo.loop;
import java.util.*;
public class Test_do_while2 {

	public static void add(int a, int b) {
		System.out.println("add:"+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	
		int a,b;
		char ch;
		do {
			System.out.println("enter num1: ");
			a=sc.nextInt();
			System.out.println("enter num2: ");
			b=sc.nextInt();
			add(a,b);
			System.out.println("do you want continue? if yes enter y: ");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y' || ch== 'Y');
		System.out.println("Thank you!!!!");
		
	}

}
