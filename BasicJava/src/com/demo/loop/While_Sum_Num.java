package com.demo.loop;
import java.util.*;
public class While_Sum_Num {

	public static void sumNum(int n) {
		int i=0;
		while(i<=n) {
			n+=n;
			System.out.println(n);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		sumNum(n);
	}

}
