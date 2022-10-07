package Calculator;

import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calcTest = new Calculator();
    @Test
    public void assertAddEquals(){Assertions.assertEquals(11, calcTest.add(3,8));
    }

    @Test
    public void assertMultiplyEquals(){
        Assertions.assertEquals(28, calcTest.multiply(7, 4));
    }

    @Test
    public void assertDivideEquals(){
        Assertions.assertEquals(3, calcTest.divide(21,7));
    }

    @Test
    public void assertSubtractEquals(){
        Assertions.assertEquals(15, calcTest.subtract(18,3));
    }
}
