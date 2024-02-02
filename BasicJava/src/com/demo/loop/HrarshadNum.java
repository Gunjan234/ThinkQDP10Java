package com.demo.loop;

public class HrarshadNum {
	
	public static boolean harshad(int n) {
		int sum=0;
		int temp=n;
		
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
			
		}
		return n % sum == 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18;
		if(harshad(n)) {
			System.out.println(n+"is harshad no.");
		}
		else
			System.out.println(n+"is not harshad no ");

	}

}
