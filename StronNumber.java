package com.demo;

public class StrongNumber {
	public static boolean isStrong(int n) {
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int last_digit= n%10;
			int fact=1;
			
			while(last_digit>0) {
				fact=fact*last_digit;
				last_digit--;				
			}
			sum += fact;
			n = n/10;
		}
		
		if(sum==temp) {
			return true;
		}
		else {
			return false;			
		}
	}
	
	public static void main(String args[]) {
		System.out.println(isStrong(145));
	}
}
