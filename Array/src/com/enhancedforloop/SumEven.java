package com.enhancedforloop;
import java.util.*;
public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {6,4,8,3,2,1};
		System.out.println(Arrays.toString(ar));
		int sumE=0;
		for(int x:ar) {
			if(x%2==0) {
				sumE+=x;
			}
		}
		System.out.println(sumE);
	}

}
