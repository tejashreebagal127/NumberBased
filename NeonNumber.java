package com.demo;

public class NeonNumber {
	public static boolean isNeon(int n) {
		int square = n*n;
		int sum=0;
		
		while(square!=0) {
			int last_digit=square%10;
			sum=sum+last_digit;
			square/=10;
		}
		
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(isNeon(9));
	}

}

