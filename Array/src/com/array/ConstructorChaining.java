package com.array;

public class ConstructorChaining {
	
	ConstructorChaining(){
		this(5);
		System.out.println("default");
	}
	ConstructorChaining(int no){
		this("hii");
		System.out.println("parameterized constructor 1");
	}
	ConstructorChaining(String name){
		System.out.println("parameterized constructor 2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining c=new ConstructorChaining();

	}

}
