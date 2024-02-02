package com.demo.loop;

public class Krishnamurthi {
	public static void krishnamurthi() {
		int n=145, temp, r, sum=0;
		temp=n;
		while(n>0) {
			int fact=1;
			r=n%10;
			for(int i=1; i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("Krishnamurthi number");
		}
		else
			System.out.println("not Krishnamurthi number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		krishnamurthi();
	}

}
