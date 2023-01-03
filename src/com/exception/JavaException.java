package com.exception;

import java.util.Scanner;

public class JavaException {
	public static void main(String[] args) {
		try {
			
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number(numerator):");
		int  numerator=sc.nextInt();
		System.out.print("enter second number(denominator):");
		int denominator=sc.nextInt();
		int a=numerator/denominator;
		System.out.print(a+" "+"I am executed without any exception");
		}
		catch(Exception e) {
			System.out.println("I am an exception");
		}
	}

}
