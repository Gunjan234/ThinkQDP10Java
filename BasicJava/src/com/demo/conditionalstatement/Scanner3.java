package com.demo.conditionalstatement;
import java.util.*;
public class Scanner3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		float r=sc.nextFloat();
		
		System.out.println("Enter the height:");
		float h=sc.nextFloat();
		
			float vol=((22*r*r*h)/7);
			
			System.out.println("Vol of cylinder is..."+vol);

	}

}
