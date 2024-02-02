package com.arrayassignment;

public class AlternativeNumber {

	public static void main(String[] args) {
		int[]numbers= {10,20,30,40,50,60};
		System.out.println("alternative numbers: ");
		for(int i=0;i<numbers.length;i+=2) {
			System.out.println(numbers[i]+"");
		}

	}

}
