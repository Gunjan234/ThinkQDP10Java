package com.demo.conditionalstatement;
import java.util.*;
public class Demo_even_odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n1;
		System.out.println("Enter num:");
		
		n1=sc.nextInt();
		
		if(n1%2==0) {
			System.out.println(n1+"is even");
		}
		else {
			System.out.println(n1+"is odd");
		}
		

	}

}
