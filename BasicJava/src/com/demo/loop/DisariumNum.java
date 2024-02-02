package com.demo.loop;

public class DisariumNum {

	public static void disariumNo(int n) {
		
		int sum=0;
		int temp=n;
		int temp1=n;
		int count=0;
		
		while(temp!=0) {
			temp=temp/10;
			count++;
	
		}
		while(temp1!=0) {
			int power=1;
			int rem=temp1%10;
			for(int i=1;i<=count;i++) {
				power=power*rem;
			}
			sum=sum+power;
			count--;
			temp1=temp1/10;
		}
		if(n==sum)
			System.out.println(n+" is disarium no");
		else
			System.out.println(n+" is not disarium no");
			
		

		
	}
	public static void main(String[]args) {
		disariumNo(135);
	}
}
