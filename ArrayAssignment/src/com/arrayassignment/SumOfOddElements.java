package com.arrayassignment;

public class SumOfOddElements {

	public static void main(String[] args) {

		int[]numbers= {2,5,8,11,14,17};
		int sum=0;
		for(int num:numbers) {
			if(num%2!=0) {
				sum+=num;
			}
		}
		System.out.println("sum of odd elements is: "+sum);

	}

}
