package com.demo.loop;
import java.util.*;
public class Assign7 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the upper limit (n): ");
			int n= sc.nextInt();
			int sumOdd=0;
			for( int i=1; i<=n; i+=2) {
			sumOdd= ++i;
			
			}
			System.out.println("sum of all odd num btw 1 n "+n+" is: "+sumOdd);
	}

}
