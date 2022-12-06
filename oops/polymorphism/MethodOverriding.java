package com.oops.polymorphism;

class Shape{
	void shapeOfObject(){
		System.out.println("Shape of the object");
	}
	void numberOfSides(){
		System.out.println("Number of sides of the object");
	}
}
class Rectangle extends Shape{
	void shapeOfObject(){
		System.out.println("Shape of the object is Rectangle");
	}
	void numberOfSides(){
		System.out.println("Number of sides of the object is 4");
	} 
}
class Triangle extends Shape{
	void shapeOfObject(){
		System.out.println("Shape of the object is Triangle");
	}
	void numberOfSides(){
		System.out.println("Number of sides of the object is 3");
	} 
}
public class MethodOverriding{
	public static void main(String args[]){
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		rect.shapeOfObject();
		rect.numberOfSides();
		tri.shapeOfObject();
		tri.numberOfSides();
	}
}