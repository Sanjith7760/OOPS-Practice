class Employee {
	static Employee e = null;
	int id;
	String name;
	
	private Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void work() {
		System.out.println(name + " is Working!");
	}
	
	public static Employee getInstance() {
		if(e == null) {
			e = new Employee(23,"sanjith");
		}
		return e;
	}
}
