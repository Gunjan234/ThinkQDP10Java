package com.demo.loop;
//do..while checks condition at last
//hence it runs at least once
public class Test_do_while {
	
	public static void show(int n) {
		int i=1;
		do {
			System.out.println(i);
			i++;
			
		}
		while(i<=n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show(10);
	}

}
