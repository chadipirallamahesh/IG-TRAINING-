package com.oops.polymorphism;

class AreaOfShape{
	double area(double x, int y){
		return x*y;
		//System.out.println(x*y);
	}
	void area(int x){
		System.out.println(x*x);
	}
}

public class MethodOverloading {
	public static void main(String args[]){
		AreaOfShape sa = new AreaOfShape();
		System.out.println(sa.area(50,60));
		sa.area(5);
	}
}