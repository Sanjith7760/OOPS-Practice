
public class FlowExample {
	
	static int staticVar = 10;
	int instanceVar = 20;
	
	static {
		System.out.println("Static block executed "+ staticVar);
		staticVar = 30;
	}
	
	{
		System.out.println("Instance block is executing: " + instanceVar);
		instanceVar=40;
	}
	
	static void staticMethod() {
		System.out.println("static method executed: " + staticVar);
	}
	
	void instanceMethod() {
		System.out.println("Instance Method is executing: "+ instanceVar);
	}
	
	public FlowExample() {
		System.out.println("Constructor executed: "+ instanceVar);
	}
	public static void main(String[] args) {
		System.out.println("Main method is executing");
		staticMethod();
		
		FlowExample example = new FlowExample();
		example.instanceMethod();
		System.out.println("Main method ended");
	}
}
