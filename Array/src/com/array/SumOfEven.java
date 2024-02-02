package com.array;

public class SumOfEven {

	static void sumEven(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of even numbers: "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {8,9,6,0,9};
	sumEven(arr);

	}

}
