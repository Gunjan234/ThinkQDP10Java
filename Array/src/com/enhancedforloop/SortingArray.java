package com.enhancedforloop;

import java.util.Arrays;

public class SortingArray {
	static void sortArray(int ar[]) {
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,9,7,8};
		
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(arr));
		
		sortArray(arr);
		
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
