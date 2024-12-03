class Vehicle {
	
}
class car extends Vehicle {
	
}
class Parent {
	Vehicle display() {
		System.out.println("parent display");
		Vehicle v1 = new Vehicle();
		return v1;
	}
}

class Child extends Parent {
	
	Vehicle display() {
		System.out.println("child display");
		Vehicle v2 = new Vehicle();
		return v2;
	}
}

public class ParentChild {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}
