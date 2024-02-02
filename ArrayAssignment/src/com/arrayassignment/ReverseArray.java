package com.arrayassignment;
import java.util.*;
import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int[]arr) {
		int[]arr2=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr2[index++]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		
	}
	public static void reverseArrays(int[]arr) {
		int j=(arr.length-1);
		for(int i=0;i<arr.length;i++) {
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int[]arr=new int[sc.nextInt()];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	}
	

	

}
