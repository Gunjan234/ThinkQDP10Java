package com.demo.loop;
import java.util.Scanner;
public class TestLoop3 {

	public static void printLoop(int start, int end) {
		int i;
		for (i=start; i<=end; i++) {
			System.out.println(i);
		}

	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int start, end;
		System.out.println("Enter start number:");
		
		start=sc.nextInt();
		System.out.println("Enter end number:");
	
		end=sc.nextInt();
		printLoop(start, end);
	}
}
