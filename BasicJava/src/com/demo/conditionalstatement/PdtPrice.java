package com.demo.conditionalstatement;
import java.util.*;
public class PdtPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double quantity, price;
		System.out.println("Enter the quantity:");
		quantity=sc.nextDouble();
		
		if(quantity>=50) {
			price=quantity*100;
			System.out.println("Total bill is "+price);
		}
		else if (quantity<=50) {
			if(quantity>=30) {
				price=quantity*125;
				System.out.println("Total bill is "+price);
			}
		}
		else {
			
		}
	}

}
