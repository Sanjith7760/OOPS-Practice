
public class ManualTest2 {
	public static void main(String[] args) {
        Calculators calc = new Calculators();

        // Test for add() method
        int addResult = calc.add(3, 5);
        if (addResult == 8) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }

        // Test for subtract() method
        int subtractResult = calc.sub(10, 5);
        if (subtractResult == 5) {
            System.out.println("Subtraction Test Passed");
        } else {
            System.out.println("Subtraction Test Failed");
        }
    }
}
