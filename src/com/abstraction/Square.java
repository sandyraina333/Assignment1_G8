package com.abstraction;

public class Square implements Shape{
	private double side;
    
    public Square(double side) { 
       this.side = side;  
    } 
    public void draw() { 
       System.out.println("Drawing Square"); 
    } 
    public double getArea() { 
       return side*side; 
    } 

}
