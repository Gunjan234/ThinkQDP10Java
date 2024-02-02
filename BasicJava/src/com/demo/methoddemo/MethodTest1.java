package com.demo.methoddemo;

public class MethodTest1 {
	
	//definition
	//wout return wout parameter

	public static void show() {
		System.out.println("hello world");

	}
    //wout return with parameter
	public static void add(int a, int b) {
		int sum=a+b;
		System.out.println("sum:"+sum);
	}
	public static void main(String[]args) {
		
		System.out.println("main");
		//method calling
		//by method name
		//method can be used multiple time in program
		//it can be used in any block
		//eg if else switch loop
		show();
		show();
		show();
		
		add(10,20);
		add(10,'a'); //ascii value(type casting)
		//add(10,"hello");//not possible
		//add(10.5,20.3); //not possible
		
		int x=10,y=2;
		add(x,y);
	}
}
