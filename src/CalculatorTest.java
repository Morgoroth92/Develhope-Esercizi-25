import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void subtractionTest() {
        int result = Calculator.subtraction(25, 10);
        assertEquals(15, result, "The subtraction 25 - 10 should give as rusult 15.");
    }

    @Test
    public void subtractionTest2() {
        int result = Calculator.subtraction(100, 50);
        assertEquals(50, result, "The result should be 50.");
    }

    @Test
    public void multiplicationTest() {
        int result = Calculator.multiplication(5, 5);
        assertEquals(25, result, "The multiply should dive as result 25.");
    }

    @Test
    public void multiplicationTest2() {
        int result = Calculator.multiplication(10, 5);
        assertEquals(50, result, "Result should be 50");
    }
}