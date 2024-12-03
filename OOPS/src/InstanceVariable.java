
class Employee1 {
	String name;
	int age;
	String designation;
	
	{
		name = "Unknown";
		age = 18;
		designation = "Intern";
	}
	public Employee1() {
		
	}
	
	public Employee1(String name, int age, String designation) {
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	
	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Age: " + age);
		System.out.println("Employee Designation: " + designation);
	}

}
public class InstanceVariable {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		emp1.displayDetails();
		
		Employee1 emp2 = new Employee1("Alice",25, "Software Engineer");
		emp2.displayDetails();
	}
}

