package com.array;

import java.util.Arrays;

public class PassinArray {

	 static void squareElements(int ar[]) {
		 for(int i=0;i<ar.length;i++) {
			 ar[i]=ar[i]*ar[i];
		 }
		// TODO Auto-generated method stub

		 System.out.println("inside method");
		 System.out.println(Arrays.toString(ar));
	}
	 int sumOfElements(int ar[]) {
		 int sum=0;
		 for(int i=0;i<ar.length;i++) {
			 sum+=ar[i];
		 }
		 return sum;
	 }
	 public static void main(String[] args) {
		int arr[]= {6,8,9,4,0};
		int a[]= {7,9,0,8};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		squareElements(arr);
		System.out.println("---------------------------------------------");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(a));
		
		squareElements(a);
		System.out.println("-------------------------------------------------");
		System.out.println(Arrays.toString(a));
		
		System.out.println("==================================================");
		PassinArray obj=new PassinArray();
		
		System.out.println("sum iss: "+obj.sumOfElements(new int[] {6,7,8,9}));
		int a1[]= {4,77,99,9};
		System.out.println("sum is: "+obj.sumOfElements(a1));
		
		
	}

}
