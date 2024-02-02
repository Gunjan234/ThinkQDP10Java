package com.demo.conditionalstatement;
import java.util.*;
public class ATMProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int crtPin=8444;
		double balance=40000.0;
				Scanner sc=new Scanner(System.in);
		int enterPin;
		do {
			System.out.println("Enter Pin: ");
			enterPin=sc.nextInt();
			if(enterPin!=crtPin) {
				System.out.println("Please retry!");
			}
		}
			while(enterPin!=crtPin);
			int choice;
			do {
				System.out.println("----Welcome----");
				System.out.println("\nOptions: ");
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Check bal");
				System.out.println("4.Exit");
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				
				switch(choice)
				{
				case1:
					System.out.println("");
				}
			}
		
	}

}
