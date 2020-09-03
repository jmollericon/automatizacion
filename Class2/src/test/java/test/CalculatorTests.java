package test;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator(10,5);
        Assert.assertEquals(calculator.add(), 15, "El resultado de la suma es incorrecto");
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator(10,5);
        Assert.assertEquals(calculator.subtract(), 5, "El resultado de la resta es incorrecto");
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator(10,5);
        Assert.assertEquals(calculator.multiplication(), 50, "El resultado de la multiplicacion es incorrecto");
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator(10,5);
        Assert.assertEquals(calculator.division(), 2, "El resultado de la division es incorrecto");
    }

    @Test
    public void testDivisionBy0(){
        Calculator calculator = new Calculator(10,0);
        Assert.assertEquals(calculator.division(), Double.POSITIVE_INFINITY, "El resultado de la division por cero es valido");
    }

    @Test(expectedExceptions = java.lang.ArithmeticException.class)
    public void testDivisionBy0Integer(){
        int div = 10/0;
    }
}
