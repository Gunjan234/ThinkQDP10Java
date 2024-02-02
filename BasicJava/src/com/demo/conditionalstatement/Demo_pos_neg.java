package com.demo.conditionalstatement;
import java.util.*;
public class Demo_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("enter num:");
		
		num=sc.nextInt();
		if(num>0) {
			System.out.println(num+ "is positive");
		}
		
		else {
			System.out.println(num+ "is negative");
		}

	}

}
