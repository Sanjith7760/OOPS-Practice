 class EmployeeArray {
	 int id;
	    String name;
	    double salary;
	    
	    public EmployeeArray(int id, String name, double salary) {
	        this.id = id;
	        this.name=name;
	        this.salary=salary;
	    }
	    
	    public void displayDetails() {
	        System.out.println(id + ", " + name + ", " + salary);
	    }
}
