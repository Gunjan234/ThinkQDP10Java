package com.array;

public class ReplaceNegWZero {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers= {-5,20,77,-9,-7,88};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<0) {
				numbers[i]=0;
			}
		}
		System.out.println("array after replacing numbers w zeros: ");

		for(int number: numbers) {
			System.out.println(number+" ");
		}
	}

}
