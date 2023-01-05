package com.exception;

import java.util.Scanner;

public class NumTry {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter a number to check  even :");
			int  num=sc.nextInt();
			try {
				   if(num % 2 == 0) 
			            System.out.println("yes "+ num + " is even");
				   
				   else
					   System.out.println("No");
			}
			catch(Exception e){
            	System.out.println("I am an exception");
			}
	     
	         try {
	    			Scanner sc1=new Scanner(System.in);
	    			System.out.print("enter a number to check odd:");
	    			int  num1=sc1.nextInt();
	    			if(num1%2!=0) 
	    				System.out.println("yes "+num1 + " is odd");
	    			else
	    				System.out.println("no "+ num1 + " is not an odd");
	    	}
	        catch(Exception e){
	            	System.out.println("I am an exception");
	            	 }
		
		}
		catch(Exception e){
        	System.out.println("I am an exception");
        	
		}     

	}

}
