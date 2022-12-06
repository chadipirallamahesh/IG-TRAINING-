package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.lambdaExpressions.Employee;

public class FlatmapStreams {

	public static void main(String[] args) {
		
		List<String> subjectsFailed1 = new ArrayList<String>();
		subjectsFailed1.add("mathematics");
		subjectsFailed1.add("english");
		subjectsFailed1.add("science");
		Student s1 = new Student("Mahesh",1,subjectsFailed1);
		
		List<String> subjectsFailed2 = new ArrayList<String>();
		subjectsFailed2.add("mathematics");
		subjectsFailed2.add("english");
		subjectsFailed2.add("economics");
		Student s2 = new Student("Raju",1,subjectsFailed2);
		
		List<String> subjectsFailed3 = new ArrayList<String>();
		subjectsFailed3.add("hindi");
		subjectsFailed3.add("mathematics");
		subjectsFailed3.add("science");
		Student s3 = new Student("Guru",1,subjectsFailed3);
		
		List<String> subjectsFailed4 = new ArrayList<String>();
		subjectsFailed4.add("economics");
		subjectsFailed4.add("english");
		subjectsFailed4.add("science");
		Student s4 = new Student("Shravan",1,subjectsFailed4);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		List<List<String>> failedStudentSubjects = studentList.stream().map(e->e.getSubjectsFailed()).collect(Collectors.toList());
		System.out.println(failedStudentSubjects);
		
		Set<String> subjects = studentList.stream().flatMap(e->e.getSubjectsFailed().stream()).collect(Collectors.toSet());
		System.out.println(subjects);
		
		List<Student> filteredStudents = studentList.stream().filter(e->e.getName().startsWith("M")).collect(Collectors.toList());
		System.out.println(filteredStudents);
		

	}

}
class Student{
	private String name;
	private int id;
	private List<String> subjectsFailed;
		
	public Student(String name, int id, List<String> subjectsFailed) {
		super();
		this.name = name;
		this.id = id;
		this.subjectsFailed = subjectsFailed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getSubjectsFailed() {
		return subjectsFailed;
	}
	public void setSubjectsFailed(List<String> subjectsFailed) {
		this.subjectsFailed = subjectsFailed;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subjectsFailed=" + subjectsFailed + "]";
	}
	
	
}