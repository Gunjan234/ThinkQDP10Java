package com.demo.loop;

public class Armstrong1 {

	public static int countDigit(int num){
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;

	}
	public static int power(int base,int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p*=base; //p=p*base
		}
		return p;
	}
	public static boolean testArmstrong(int num) {
		int pow=countDigit(num);
		int original=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem,pow); //sum=sum+rem*rem*rem  //sum=sum+Math.pow(rem,pow)
			num/=10;
		}
		return original==sum;
	}
	public static void main(String[]args) {
		//System.out.println(countDigit(23));
		//System.out.println(power(2,3));
		boolean status=testArmstrong(371);
		if(status)
			System.out.println("Armstrong");
		else
			System.out.println("no armstrong");
	}

}
