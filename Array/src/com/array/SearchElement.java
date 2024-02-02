package com.array;
import java.util.*;
public class SearchElement {

	static boolean searchElements(int ar[],int ele) {
		int count =0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele)
				count++;
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int[]arr=new int[sc.nextInt()];
		for(int i=0; i<arr.length;i++) {
			System.out.println("enter element: ");
			arr[i]=sc.nextInt();
		}
		SearchElement s1=new SearchElement();
		System.out.println("enter search element: ");
		int search=sc.nextInt();
		System.out.println(s1.searchElements(arr,search));
	}
}
