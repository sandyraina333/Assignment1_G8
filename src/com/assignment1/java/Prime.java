package com.assignment1.java;

import java.util.Scanner;

public class Prime {
	public static int primeHelper(int n) {
		for(int i = n; i <= Integer.MAX_VALUE;i++) {
			int count = 0;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				return i;
			}
		}
		return -1;
	}
	public static int primeHelper2(int n) {
		for(int i = n; i > 2;i--) {
			int count = 0;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				return i;
			}
		}
		return -1;
	}
	public static int prime(int n) {
		int count = 0;
		for(int i = 2; i < n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 0) {
			return n;
		}else {
			int inc = primeHelper(n);
			int dec = primeHelper2(n);
			int value1 = inc - n;
			int value2 = n - dec;
			if(value1 > value2) {
				return dec;
			}
			return inc;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num:");
		int n = sc.nextInt();
		sc.close();
		if(n == 1) {
			System.out.println("1 is neither prime or composite");
			
		}else {
			System.out.println(prime(n));
		}
		

	}

}