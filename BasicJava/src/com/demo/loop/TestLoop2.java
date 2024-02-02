package com.demo.loop;
import java.util.*;
public class TestLoop2 {

	public static void printLoop(int range) {
		int i;
		for(i=1; i<=range; i++) {
			System.out.println(i);
		}

	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		printLoop(n);
	}
}
