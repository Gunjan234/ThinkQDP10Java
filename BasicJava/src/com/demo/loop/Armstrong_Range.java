package com.demo.loop;

public class Armstrong_Range {

	public static int countDigit(int num){
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
		}
		public static int findpower(int base,int pow) {
			int p=1,i;
			for(i=1;i<=pow;i++) {
				p=p*base;
				
			}
			return p;
			
		}
		public static boolean isArmstrong(int num) {
			int rem,original=num,sum=0;
			int pow=countDigit(num);
			while(num!=0) {
				rem=num%10;
				sum=sum+findpower(rem,pow);
				num/=10;
				
			}return original==sum;
		}
		public static void ArmstrongNo() {
			int i;
			for(i=1;i<=10000;i++) {
				if(isArmstrong(i))
					System.out.println(i);
			}
		}public static void main(String[]args) {
			ArmstrongNo();
		}
		
		
		

	

}
