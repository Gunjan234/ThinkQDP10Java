package com.array;
import java.util.*;
public class FindMinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size: ");
		int size=sc.nextInt();
		
		int[]numbers=new int[size];
		System.out.println("enter numbers: ");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		minMax(numbers);

	}
	public static void minMax(int[]numbers) {
		int min=numbers[0];
		int max=numbers[0];
		for(int num:numbers) {
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
		}
		System.out.println("minimum number: "+min);
		System.out.println("maximum number: "+max);
	}

}
