package com.exception;

import java.util.Scanner;

class Palindrome{ 

	 public static void main(String args[]){  
		 try {
			 Scanner inp = new Scanner(System.in);   
		      System.out.println("Enter a number to check  palindrome");  
		      int  num=inp.nextInt(); 
			 int r,sum=0;
			int temp;     
		 
		temp=num;    
		  while(num>0){    
		   r=num % 10;  //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		catch(Exception e) {
			
			 System.out.println(e+"I am an exception");   
		 }
	 }
		  
	}
