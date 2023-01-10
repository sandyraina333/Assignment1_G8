package com.homework;

public class Fibonocci {
	static int num1=0;
	static int num2=1;
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<6;i++) {
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
			
		}
	}
	
	

}
