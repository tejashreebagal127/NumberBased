package com.demo;

public class ReverceNumber {
	public static int reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			int last_digit = n%10;
			rev = rev*10 + last_digit;
			n = n/10;			
		}
		
		return rev;		
	}
	
	
	public static void main(String args[]) {
		System.out.print(reverseNumber(5643));
	}
}
