package com.demo.loop;

public class Assign2 {

	

	    public static void main(String[] args) {
	        int start = 521;
	        int end = 229;

	        System.out.println("Odd numbers between " + start + " and " + end + ":");

	        // Iterate from start to end, decrementing by 2 to print odd numbers
	        while (start >= end) {
	            if (start % 2 != 0) {
	                System.out.print(start + " ");
	            }
	            start -= 2;
	        }
	    }
	}
		




