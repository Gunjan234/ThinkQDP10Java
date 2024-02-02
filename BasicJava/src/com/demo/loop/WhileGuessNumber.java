package com.demo.loop;
import java.util.*;
public class WhileGuessNumber {
	
	public static void GuessNum(int n) {
		int guess=50, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		
		n=sc.nextInt();
		
		while(n>0) {
			if(n==guess) {
				System.out.println("Guess is right");
				break;
			}
			else if(n>guess) {
				
				System.out.println("number is greater than guess.");
				System.out.println("Enter number: ");
				n=sc.nextInt();
			}
			else if (n<guess) {
				System.out.println("number is smaller than guess");
				System.out.println("Enter number: ");
				n=sc.nextInt();
			}
			count++;
		}
		System.out.println("count="+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		GuessNum(n);
	
		
		

	}

}
