package com.LambdaExpressions;

public class LambdaExFunctionalInterface {
	 public static void main(String[] args) {   
		 MyFucInterfaceAddition ad1=(a,b)->(a+b);  
	        System.out.println(ad1.addition(10,20));
	 }
}
@FunctionalInterface
interface MyFucInterfaceAddition{
	public int addition(int a, int b);
}