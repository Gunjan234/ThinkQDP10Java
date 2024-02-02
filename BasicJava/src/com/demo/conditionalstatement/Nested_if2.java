package com.demo.conditionalstatement;
import java.util.*;
public class Nested_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("number is even");
			if(num%6==0) {
				System.out.println("number is even and is divisible by 6");
			}
			else {
				System.out.println("number is not disible by 6");
			}
		}
		else {
			System.out.println("number is odd");
			if(num%5==0) {
				System.out.println("number is odd and is divisible by 5");
				
			}
			else {
				System.out.println("number is not disible by 5");
			}
			
		}
	}

}
