package com.demo.loop;
import java.util.*;
public class Assign6 {

	public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the upper limit (n): ");
		        int n = scanner.nextInt();

		        int sumEven = 0;

		        for (int i = 2; i <= n; i += 2) {
		            sumEven += i;
		        }

		        System.out.println("The sum of all even numbers between 1 and " + n + " is: " + sumEven);
		    
		

	}

}
