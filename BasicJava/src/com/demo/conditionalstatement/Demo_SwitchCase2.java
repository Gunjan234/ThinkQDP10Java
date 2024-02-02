package com.demo.conditionalstatement;
import java.util.Scanner;
public class Demo_SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Tea\nCoffee\nCold drink\n");
		System.out.println("Enter choice:");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		
		case 'a':
		case 'A':
			System.out.println("Tea Rs 30");
			break;
			
		case 'b':
		case 'B':
			System.out.println("cold drink Rs 50");
			break;
		
		default:
			System.out.println("invalid choice");
			
		}
		
		
	}

}
