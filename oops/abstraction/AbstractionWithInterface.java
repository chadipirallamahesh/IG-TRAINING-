package com.oops.abstraction;

interface TwoWheeler {
	void twoWheelerName();
	void twoWheelerModel();
}

abstract class Bike implements TwoWheeler {

	@Override public void twoWheelerName()
	{
		System.out.println("TwoWheeler Name is Honda");
	}
}

class SportsBike extends Bike {
	@Override public void twoWheelerModel()
	{
		System.out.println("2022 Model Bike");
	}
}

public class AbstractionWithInterface {

	public static void main(String[] args) {
		SportsBike sb = new SportsBike();
		sb.twoWheelerName();
		sb.twoWheelerModel();

	}

}
