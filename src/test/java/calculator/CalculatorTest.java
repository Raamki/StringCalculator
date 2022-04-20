package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    CalculatorApp calculatorApp = new CalculatorApp();
    @Test
    public void sumOfStringWithNewLineAndComma() {
        assertEquals(6, calculatorApp.calculate("1\n2,3"));

    }

    @Test
    public void sumOfStringWithNewLine() {
        assertEquals(3, calculatorApp.calculate("1\n\n2"));
    }

    @Test
    public void sumOfEmptyString() {
        assertEquals(0, calculatorApp.calculate(""));
    }
}
