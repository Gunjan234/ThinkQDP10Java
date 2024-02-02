package com.demo.loop;

public class Automorphic {

	public static void automorphic(int n) {
		// TODO Auto-generated method stub
		int temp=n;
		int sq,count=0;
		int rem;
		double power;
		sq=n*n;
		while(n!=0) {
			rem=n%10;
			n=n/10;
			count++;
			
		}
		System.out.println("count: "+count);
		power=Math.pow(10, count);
		System.out.println("power: "+power);
		if(sq%power==temp) {
			System.out.println("automorphic no");
		}
		else
			System.out.println("not automorphic no");

	}
	public static void main(String[]args) {
		automorphic(25);
	}

}
