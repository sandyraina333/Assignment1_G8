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

