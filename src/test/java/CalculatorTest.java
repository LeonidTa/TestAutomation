import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calcTest = new Calculator();
        int a = 1;
        int b = 2;
        double result = calcTest.add(a, b);
        Assertions.assertEquals(3,result);
    }

    @Test
    void subtract() {
        Calculator calcTest = new Calculator();
        int a = 4;
        int b = 2;
        final double result = calcTest.subtract(a, b);
        Assertions.assertEquals(2, result);
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }
}