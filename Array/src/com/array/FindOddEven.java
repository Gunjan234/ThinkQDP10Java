package com.array;
import java.util.*;
public class FindOddEven {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		
		int[]numbers=new int[size];
		System.out.println("enter number: ");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		oddEven(numbers);

	}
	public static void oddEven(int[]numbers) {
		int even=0;
		int odd=0;
		for(int num:numbers) {
			if(num%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("even numbers: "+even);
		System.out.println("odd numbers: "+odd);
	}

}
