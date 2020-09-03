package calculator;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        System.out.println("Entre el numero 1: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();

        System.out.println("Entre el numero 2: ");
        double number2 = scanner.nextDouble();
        scanner.close();

        Calculator calculator = new Calculator(number1, number2);

        System.out.println("El resultado de la suma es de: " + calculator.add());
        System.out.println("El resultado de la resta es de: " + calculator.subtract());
        System.out.println("El resultado de la suma es multipilicacion es de : " + calculator.multiplication());
        System.out.println("El resultado de la division es de: " + calculator.division());
    }
}
