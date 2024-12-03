package com.kodnest.oops.encapsulation;

class Student {
	private String name;
	private int age;
	private String gender;
	
	protected void eat() {
		System.out.println("Student is eating.");
	}
	
	public void sleep() {
		System.out.println("Student is sleeping.");
	}
	
	 void study() {
		System.out.println("Student is Studying.");
	}
}

public class StudentApp {
	public static void main(String[] args) {
			Student student = new Student();
			student.eat();
			student.sleep();
			student.study();
		}
}

