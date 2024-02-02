package com.demo.loop;
import java.util.*;
public class FindFACTOR {

	public static void prime(int n) {
		int i;
		int count=0;
		for(i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
				//System.out.println(i);
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(n+" is prime");}
		else {
			System.out.println(n+" is not a prime");
		}
	
	}
	public static void main(String[]args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		n=sc.nextInt();
		prime(n);
	}
}
