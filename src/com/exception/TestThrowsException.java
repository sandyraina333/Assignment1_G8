package com.exception;

import java.util.Scanner;

public class TestThrowsException {
	
	public static void main(String[] args) throws ArithmeticException{
			Scanner inp=new Scanner(System.in);
			System.out.print("enter a number:");
			int  num=inp.nextInt();
			if(num%2==0)
			{
				System.out.println(num+" is divisible by 2");
			}
			else {
				throw new ArithmeticException(num+" is not divisible by 2");
			}
	}

}

