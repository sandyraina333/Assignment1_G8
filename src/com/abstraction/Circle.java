package com.abstraction;

class Circle implements Shape {
    private double radius;
     
    public Circle(double r) { 
       this.radius = r; 
    } 
    public void draw() { 
       System.out.println("Drawing Circle"); 
    } 
    public double getArea() { 
       return Math.PI*radius*radius; 
    } 
 }
 
 class Rectangle implements Shape {
    private double length;
    private double width;
     
    public Rectangle(double length, double width) { 
       this.length = length; 
       this.width = width; 
    } 
    public void draw() { 
       System.out.println("Drawing Rectangle"); 
    } 
    public double getArea() { 
       return length*width; 
    } 
 }
 class Square implements Shape {
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
