package com.enhancedforloop;
//write a program to half sort the array in ascending and half in descending

import java.util.Arrays;

public class HalfSort {
	static void ascending(int ar[]) {
		for(int i=0;i<ar.length/2;i++) {
			for(int j=i+1;j<ar.length/2;j++) {
				if(ar[j]<ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=ar.length/2;i<ar.length;i++) {
			for(int j=i+1;j<ar.length/2;j++) {
				if(ar[j]>ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,8,4,0,2,8};
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		ascending(arr);
		
		

	}

}
