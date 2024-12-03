import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

	    @Test
	    public void testAdd() {
	        Calculators calculator = new Calculators();
	        int addition1 = calculator.add(5, 3); 
	        assertEquals(8, addition1);
	        int addition2 = calculator.add(10, 4); 
	        assertEquals(14, addition2);
	        int addition3 = calculator.add(12, 4); 
	        assertEquals(16, addition3);
	        
	        
	        int subtraction1 = calculator.sub(10, 5); 
	        assertEquals(5, subtraction1);
	        int subtraction2 = calculator.sub(14, 8); 
	        assertEquals(6, subtraction2);
	        int subtraction3 = calculator.sub(18, 8); 
	        assertEquals(10, subtraction3);
	    }

}
