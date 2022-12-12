package cn.tuyucheng.taketoday;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(-1, calculator.sub(2, 3));
    }

    @Test
    public void testMul() {
        assertEquals(6, calculator.mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calculator.div(6, 3));
    }
}