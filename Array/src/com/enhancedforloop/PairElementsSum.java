package com.enhancedforloop;

import java.util.Arrays;

public class PairElementsSum {

	static void pairElements(int[] arr,int sum) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
					
					
				}
			}
			
		}
	}


 public static void main(String[]args) {
	 int[]arr= {4,7,8,9,5,8};
	 int sum=7;
	 System.out.println(Arrays.toString(arr));
	 pairElements(arr,sum);
 }
}