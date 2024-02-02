package com.demo.loop;

public class Series1 {

	public static void main(String[] args) {
		System.out.print("Series: ");

        int first = 2;
        int last = 20;  
        int inc = 2; 
        int neg = 1; 

        for (int i = first; i <= last; i += inc) {
            int num = i * neg;  
            System.out.print(num + " ");
            neg *= -1;  
        }

	}

}
