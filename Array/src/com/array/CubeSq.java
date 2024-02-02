package com.array;
import java.util.*;
public class CubeSq {

	public static int calCube(int number) {
		return number*number*number;
	}
	public static int calSq(int number) {
		return number*number;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int number=sc.nextInt();
		
		System.out.println("do you wanna calculate square or cube???");
		char choice=sc.next().charAt(0);
		
		int result;
		if(choice=='s') {
			result=calSq(number);
			System.out.println("square of "+number+" is: "+result);
		}
		else if(choice=='c') {
			result=calCube(number);
			System.out.println("cube of "+number+" is: "+result);
		}
		else {
			System.out.println("invalid choice,pls enter 's' for square or 'c' for cube");
		}

	}

}
