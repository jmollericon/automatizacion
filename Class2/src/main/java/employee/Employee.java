package employee;

public class Employee {
    private String name;
    private int payRateByHour;

    public Employee(String name, int payRateByHour){
        this.name = name;
        this.payRateByHour = payRateByHour;
    }

    public double calculateMonthlySalary(int hoursWorked){
        return payRateByHour * hoursWorked;
    }

    public String getName() {
        return name;
    }
}
