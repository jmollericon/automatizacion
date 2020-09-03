package employee;

import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {
        System.out.println("Entre el nombre del empleado: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Entre el valor hora del empleado: ");
        int payRateByHour = scanner.nextInt();

        System.out.println("Entre la cantidad de horas trabajadas en el mes: ");
        int hoursWorked = scanner.nextInt();
        scanner.close();

        Employee employee = new Employee(name, payRateByHour);

        System.out.println("El salario mensual del empleado " + employee.getName() + " es de $"
                + employee.calculateMonthlySalary(hoursWorked));
    }
}
