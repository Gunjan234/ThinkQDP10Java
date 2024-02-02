package com.demo.loop;
import java.util.*;
public class Palindrome {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		
		int num=n;
		int reverse=0;
		int r;
		
		while(n!=0){
			r=n%10;
			reverse=reverse*10+r;
			n/=10;
		}
		if(num==reverse) {
			System.out.println(num+" is palindrome");
		}
		else {
			System.out.println(num+" is not palindromw");
		}
		

	}

}
