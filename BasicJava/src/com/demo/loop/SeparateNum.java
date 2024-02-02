package com.demo.loop;
import java.util.*;

public class SeparateNum {
	
	public static void SepNum(int num) {
		int rem;
		
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println(rem);
			System.out.println(num);
		}
		System.out.println("og num:"+num);
	}
	public static void countDigits(int num) {
		int rem;
		int count=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println("count:"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num=sc.nextInt();
		SepNum(num);
		countDigits(num);
	}

}
