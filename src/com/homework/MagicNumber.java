package com.homework;

import java.util.Scanner;

public class MagicNumber {
	static int n;
	static int remainder=1;
	static int number;
	static int sum=0;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to check the number is magic number or not :");
			 n=sc.nextInt();
		}
			number=n;
			 while(number>9) {
				 while(number>0) {
					 remainder=number%10;
					 sum=sum+remainder;
					 number=number/10;
				 }
					
				 number=sum;
				 sum=0;
			 }
		
		if(number==1)
		{
			System.out.println("It is a magic number");
		}
		else
		{
			System.out.println("It is not a magic number");
		}
	}

}
