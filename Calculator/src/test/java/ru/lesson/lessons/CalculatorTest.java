package ru.lesson.lessons;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Mergen on 07.03.2016.
 */
public class CalculatorTest {


    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void testDeduct() throws Exception {
        Calculator calculator = new Calculator();
        calculator.deduct(2, 1);
        assertEquals(1, calculator.getResult());
    }

    @Test
    public void testMultiply() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiply(2, 2);
        assertEquals(4, calculator.getResult());
    }

    @Test
    public void testDivided() throws UserException{
        Calculator calculator = new Calculator();
        calculator.divided(4, 2);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void testPover() throws Exception {
        Calculator calculator = new Calculator();
        calculator.power(4, 2);
        assertEquals(16, calculator.getResult());
    }

}