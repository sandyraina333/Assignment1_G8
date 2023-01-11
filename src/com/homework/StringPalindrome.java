package com.homework;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string as an input to check whether it is palindrome or not");
			String inp= sc.nextLine();
			if(isPalindrome(inp))
			{
			    System.out.println(inp+" is a palindrome string");
			}
			else
			{
			    System.out.println(inp+" is not a palindrome string");
			}
		}
    }
 
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
        left++;
        right--;
    }
    return true;
} 
}
