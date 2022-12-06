package com.oops.encaplsulatin;


class Student{
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Mahesh");
		s.setMarks(55);
		System.out.println(s.getName());
		System.out.println(s.getMarks());

	}

}
