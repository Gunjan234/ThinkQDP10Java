package com.arrayassignment;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[]numbers = {57,99,78,90,8};
		int search=15;
		
		boolean found=false;
		for(int num: numbers) {
			if(num==search) {
				System.out.println(search+"is found in array at index");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(search+"is not found in array");
		}

	}

}
