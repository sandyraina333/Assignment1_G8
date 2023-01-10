package com.homework;

public class SwapVariable {
	static int a=2;
	static int b=3;
	public static void main(String[] args) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping two variables");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
