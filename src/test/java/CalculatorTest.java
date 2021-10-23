import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calcTest;

    @BeforeEach
    void setUp() {
        calcTest = new Calculator();
    }

    @Test
    void add() {
        int a = 1;
        int b = 2;
        double result = calcTest.add(a, b);
        Assertions.assertEquals(3,result);
    }

    @Test
    void subtract() {
        int a = 4;
        int b = 2;
        final double result = calcTest.subtract(a, b);
        Assertions.assertEquals(2, result);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(4, calcTest.multiply(2,2));
        Assertions.assertEquals(6, calcTest.multiply(2, 3));
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