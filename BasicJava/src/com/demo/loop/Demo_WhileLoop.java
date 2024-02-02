package com.demo.loop;

public class Demo_WhileLoop {

	public static void printNo(int n) {
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print:");
		printNo(10);
	}

}
