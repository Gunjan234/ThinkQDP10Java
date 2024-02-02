package com.demo.loop;

public class CheckPrimeTest2 {
	
	public static void checkPrime(int n) {
		int i;
		int count=0;
		for(i=2; i<=n/2; i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
	}
	

	public static void main(String[] args) {
		checkPrime(17);

	}

}
