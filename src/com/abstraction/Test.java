package com.abstraction;

public class Test {
	public static void main (String args[]) {
        Shape circle = new Circle(8);
        circle.draw(); 
        System.out.println("Area of given circle = "+circle.getArea());
        Shape rect = new Rectangle(12,15);
        rect.draw(); 
        System.out.println("Area of given rectangle = "+rect.getArea());
        Shape square = new Square(5);
        square.draw(); 
        System.out.println("Area of given Square= "+square.getArea());
    }
}
