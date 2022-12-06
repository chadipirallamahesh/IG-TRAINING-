package com.oops.inheritance;

class Salary{
	int salary = 10000;
}

class Worker extends Salary{
	String name = "Mahesh";
}

public class SingleInheritance {

	public static void main(String[] args) {
		Worker w = new Worker();
		System.out.println("Worker name : "+w.name);
		System.out.println("Worker salary : "+w.salary);

	}

}
