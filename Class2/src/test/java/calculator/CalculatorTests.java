package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator(10,5);
        double result = calculator.add();
        Assert.assertEquals(result, 15, "La suma no es correcta.");
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator(10,5);
        double result = calculator.subtract();
        Assert.assertEquals(result, 5, "La resta no es correcta.");
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator(10,5);
        double result = calculator.multiplication();
        Assert.assertEquals(result, 50, "La multiplicación no es correcta.");
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator(10,5);
        double result = calculator.division();
        Assert.assertEquals(result, 2, "La división no es correcta.");
    }

    @Test
    public void testDivisionBy0(){
        Calculator calculator = new Calculator(10,0);
        double result = calculator.division();
        Assert.assertEquals(result, Double.POSITIVE_INFINITY, "El resultado de la división por cero es valido");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionBy0Integer(){
        int div = 10/0;
    }
}
