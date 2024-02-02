package com.arrayassignment;

public class MinimumNumber {

	public static void main(String[] args) {

		int[] numbers= {45,98,55,99,46};
		int min=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		System.out.println("minimum number in array is: "+min);

	}

}
