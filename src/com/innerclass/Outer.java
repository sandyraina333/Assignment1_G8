package com.innerclass;

public class Outer {
	private int data=333;
	void display()
	{
		class LocalInner{
			void msg() {
				System.out.println(data);
			}
		}
		LocalInner l=new LocalInner();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer li=new Outer();
		li.display();

	}

}
