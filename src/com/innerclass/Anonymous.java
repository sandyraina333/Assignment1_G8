package com.innerclass;

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person() {
			void walk() {
				System.out.println("The person is walking");
			}
		};
		p.walk();
	}

}
