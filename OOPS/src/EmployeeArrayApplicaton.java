import java.util.*;
public class EmployeeArrayApplicaton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Employee id: ");
//		int id = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter a Employee name: ");
//		String name = sc.nextLine();
//		
//		System.out.println("Enter a Employee salary: ");
//		double salary = sc.nextDouble();
//		EmployeeArray emp = new EmployeeArray(id, name, salary);
//		emp.displayDetails();
		System.out.println("Enter number of Employees: ");
		int noOfEmployee = sc.nextInt(); //initialize number of employees
		EmployeeArray[] emp = new EmployeeArray[noOfEmployee];
		for (int i = 0; i < emp.length; i++) {
	        System.out.println("Enter Employee " + (i + 1) + " details:");
	        System.out.println("Enter Employee " + (i + 1)+" id : ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter Employee " + (i + 1)+" name: ");
	        String name = sc.nextLine();
	        System.out.println("Enter Employee " + (i + 1)+" salary: ");
	        double salary = sc.nextDouble();

	        EmployeeArray employees = new EmployeeArray(id, name, salary);
	        emp[i] = employees;
	    }

	    System.out.println("Employee Details:");
	    for (int i = 0; i < emp.length; i++)  {
	    	emp[i].displayDetails();
	    }


	}

}
