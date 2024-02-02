package com.demo.loop;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int flag=n;
		int r, sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(flag==0)
			System.out.println("armstrong number");
		else
			System.out.println("not an armstrong number");
	}

}
