package com.demo.methoddemo;
import java.util.*;
public class CalDemoWMethod {

	//when we are using method wout void
	//we must use return keyword
	//note:we cana return only one value at a time
	//we cant write any statement after return
	//return is the last statement
	//whenever we want to test any condition use return
	
	public static int add(int a,int b){
		return a+b;

	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int ans=0;
		int choice;
		System.out.println("Enter num1:");
		n1=sc.nextInt();
		
		System.out.println("Enter num2:");
		n2=sc.nextInt();
		System.out.println("1.add\n2.sub\n3.multiply\n4.div\n");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ans=add(n1,n2);
			break;
		case 2:
			ans=sub(n1,n2);
			break;
		}
		
		System.out.println("ans:"+ans);
		//call
		//int ans=add(n1,n2);
		//System.out.println("sum:"+ans);
	}

}
