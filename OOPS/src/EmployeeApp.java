
public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp = Employee.getInstance();
		System.out.println(emp);
		emp.work();
		
		Employee emp1 = Employee.getInstance();
		System.out.println(emp1);
		emp1.work();
		
		Employee.e = null;
		Employee emp2 = Employee.getInstance();
		System.out.println(emp2);
		emp2.work();

	}

}
