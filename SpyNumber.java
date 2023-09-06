package com.demo;

public class SpyNumber {
	public static boolean isSpy(int n) {
		int sum=0;
		int prod=1;
		
		while(n>0) {
			int last_digit=n%10;
			sum+=last_digit;
			prod*=last_digit;
			n=n/10;
		}
		
		if(sum==prod) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String args[]) {
		System.out.println(isSpy(1124));
	}
}
