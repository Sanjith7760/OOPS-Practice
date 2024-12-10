package com.OOPS.Practice;

class Student {
	String Name;
	int Age;
	String City;
	
	public void learn() {
		System.out.println(Name+" Learning full stack ");
	}
}
public class StudentApp {

	public static void main(String[] args) {
		Student st = new Student();
		st.Name="Sanjith";
		st.Age = 23;
		st.City = "Mysore";
		st.learn();
		
		System.out.println("Name : "+st.Name);
		System.out.println("Age : "+st.Age);
		System.out.println("City : "+st.City);
	}
}
