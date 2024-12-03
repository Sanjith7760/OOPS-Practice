
public class ManualTest {

	public static void main(String[] args) {
		 Calculators calc = new Calculators();
	        
	        // Using reusable assertion helper method
	        assertEqual(8, calc.add(3, 5), "add(3, 5)");
	        assertEqual(4, calc.sub(5, 3), "subtract(5, 3)");
	    }

	    public static void assertEqual(int expected, int actual, String testName) {
	        if (expected == actual) {
	            System.out.println("Test Passed: " + testName);
	        } else {
	            System.out.println("Test Failed: " + testName + " - Expected " + expected + " but got " + actual);
	     }
	 }
}

