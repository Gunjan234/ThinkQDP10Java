package com.array;

public class ArrayLogics {
	static boolean searchEle(int ar[],int ele) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele)
				return true;
		}
		return false;
	}
	static void searchEleOccurences(int ar[],int ele) {
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) {
				flag=true;
				System.out.println("position: "+i);
			}
		}
		if(!flag)
			System.out.println("element not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,6,4,6,3,2,1};
		if(searchEle(arr,6)) {
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
		System.out.println("------------------------------");
		searchEleOccurences(arr,6);

	}

}
