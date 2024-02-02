package com.demo.conditionalstatement;
import java.util.*;


public class Airlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name, bp, des;
		double amount =0;
		int choice, coupon;
		System.out.println("Welcome to Airlines");
		System.out.println("Please enter your name:");
		name=sc.next();
		System.out.println("1.Luftansa\n2.AirIndia\n3.Indigo");
		System.out.println("Enter your choice:");
	    choice=sc.nextInt();
		
		switch(choice){
			
		case 1:
			System.out.println("Enter your boarding place:");
		    bp=sc.next();
			System.out.println("Enter your destination:");
			des=sc.next();
			
			
			System.out.println("Your amount will be 20000");
			System.out.println("Do you have any coupon?");
			System.out.println("Enter your answer:");
			coupon=sc.nextInt();
			if(coupon==1) {
				
				amount=20000;
				System.out.println("You have 25% discount on your amount");
				amount=sc.nextDouble();
				amount=(amount-amount*0.25);
			}
			
			System.out.println("Discount amount:"+amount);
			System.out.println("Your ticket is booked!");
			System.out.println("Thank you for traveling with Luftansa");
			
			break;
			
			
		case 2:
			System.out.println("Enter your boarding place:");
		    bp=sc.next();
			System.out.println("Enter your destination:");
			des=sc.next();
			
			
			System.out.println("Your amount will be 22000");
			System.out.println("Do you have any coupon?");
			System.out.println("Enter your answer:");
			coupon=sc.nextInt();
			if(coupon==1) {
				System.out.println("Yes");
				amount=22000;
				System.out.println("You have 23% discount on your amount");
				amount=sc.nextDouble();
				amount=(amount-amount*0.23);
			}
			
			System.out.println("Discount amount:"+amount);
			System.out.println("Your ticket is booked!");
			System.out.println("Thank you for traveling with Luftansa");
			
			
			
			break;
		}
		
	}

}
