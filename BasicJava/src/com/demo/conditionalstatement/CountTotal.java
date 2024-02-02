package com.demo.conditionalstatement;
import java.util.*;
public class CountTotal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		int n500,n200, n100,n50,n20, n10=0;
		
		if(amount>=500) {
			n500=amount/500;
			amount=amount%500;
			System.out.println("notes of 500= "+n500);
		}
		if(amount>=200) {
			n200=amount/200;
			amount=amount%200;
			System.out.println("notes of 200= "+n200);
			
		}
		if(amount>=100) {
			n100=amount/100;
			amount=amount%100;
			System.out.println("notes of 100= "+n100);
		}
		if(amount>=50) {
			n50=amount/50;
			amount=amount%50;
			System.out.println("notes of 50= "+n50);
		}
		if(amount>=20) {
			n20=amount/20;
			amount=amount%20;
			System.out.println("notes of 20= "+n20);
		}
		if(amount>=10) {
			n10=amount/10;
			amount=amount%10;
			System.out.println("notes of 10= "+n10);
		}
		

	}

}
