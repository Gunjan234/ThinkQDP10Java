package com.demo.loop;
import java.util.*;
public class FindFactors {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, num;
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		for(i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}

	}

}
