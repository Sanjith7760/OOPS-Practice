
//public class AnimalMain {
//	public static void main(String[] args) {
//		Animal animal = new Animal() {
//			public void eat() {
//				System.out.println("Animal is Eating");
//			}
//		};
//		animal.eat();
//	}
//}




//public class AnimalMain {
//	public static void main(String[] args) {
//		Animal animal = () -> System.out.println("Animal is Eating");
//		animal.eat();
//	}
//}

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = (name, type) -> {
		System.out.println("Animal is Eating " + name );
		System.out.println("Food type is " + type);
		};
		animal.eat("Grass ","Veg");
		
	}
}


