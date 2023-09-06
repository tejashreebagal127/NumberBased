package com.demo;

public class Swap {
	public static void main (String args[]) {
		int a = 10 ; 
		int b = 20 ;
		
		// swap two numbers using 3rd variable
		int temp = a;
			a = b;
			b = temp ;
			
		System.out.println(a);
		System.out.println(b);
		// to swap without using 3rd variable
				a = a+b;
				b = a-b;
				a = a-b;
				
				System.out.println(a);
				System.out.println(b);
				
	}
}
