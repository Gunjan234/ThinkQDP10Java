package com.demo.conditionalstatement;
import java.util.*;
public class Scanner4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		int num=sc.nextInt();
		
	    System.out.println("Enter the number2:");
	    int num2=sc.nextInt();
	    
	    if(num>num2) {
	    	System.out.println("number1 is greater than number2 ");
	    }
	    else
	    	System.out.println("number2 is greater than number1");

	}

}
