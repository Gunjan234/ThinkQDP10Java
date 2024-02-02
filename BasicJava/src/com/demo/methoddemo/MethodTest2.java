package com.demo.methoddemo;
import java.util.*;

//wap to create method display w parameter String and take name from user
public class MethodTest2 {

	public static void display(String name) {
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter name:");
		name= sc.next();
		display(name);

	}

}
