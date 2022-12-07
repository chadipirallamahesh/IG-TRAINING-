package com.junit;

public class EvenNumber {
	static int number = 6;
	public static boolean FindEvenOddNumber() {
		if(number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int DivisibleByNumber() {
		return number%6;
	}
}
