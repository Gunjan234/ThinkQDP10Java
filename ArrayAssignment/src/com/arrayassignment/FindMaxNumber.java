package com.arrayassignment;

public class FindMaxNumber {

	public static void main(String[] args) {
		int[]numbers= {65,77,46,9,78,55};
		int max=numbers[0];
		
		for(int  i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("maximum number in array is: "+max);
		

	}

}
