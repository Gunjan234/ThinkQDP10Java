package com.demo.loop;
import java.util.*;
public class Frequency {
	public static void frequency(int n){
		int i;
		i=0;
		int count=0;
		for(i=0;i<=9;i++) {
			count=0;
			int temp=n;
			while(temp>0) {
				int r=temp%10;
				if(r==i) {
					count++;
					
				}
				temp=temp/10;
			
			
		}
		if(count>0) {
			System.out.println(i+"------"+count);
		}
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		System.out.println("freq: ");
		frequency(n);

	}

}
