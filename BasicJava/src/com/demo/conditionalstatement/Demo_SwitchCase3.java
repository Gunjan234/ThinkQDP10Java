package com.demo.conditionalstatement;
import java.util.*;
public class Demo_SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String choice;
		System.out.println("----welcome to my cafe----");
		System.out.println("Tea\nCoffee\nCold drink\n");
		System.out.println("Enter choice:");
		
		choice=sc.next();
		
		switch(choice) {
		
		case "tea":
		case "TEA":
		case "Tea":
			System.out.println("Tea Rs 30");
			break;
			
		case "coffee":
		case "Coffee":
			System.out.println("Coffee Rs 100");
			break;
		
		case "cold drink":
			System.out.println("cold drink Rs 50");
			break;
			
		default:
			System.out.println("invalid choice");
		}
	}

}
