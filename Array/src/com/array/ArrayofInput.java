package com.array;
import java.util.*;

public class ArrayofInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("----------------");

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	//code to print even numbers from array

}
