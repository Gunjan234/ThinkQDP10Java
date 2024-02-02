package com.array;

public class Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[5];
		arr[0]=90;
		arr[1]=89;
		arr[2]=100;
		arr[3]=79;
		arr[4]=80;
		//arr[5]=99;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------");
		
		//array as literal
		//int arr1[]={5,6,8,3,1};
		int arr1[]=new int[] {5,6,8,3,1};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
