package test;

import employee.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTests {

    @Test
    public void testCalculateMonthlySalary(){
        Employee employee = new Employee("Juan", 5);
        Assert.assertEquals(employee.calculateMonthlySalary(160), 800);
    }

    @Test
    public void testEmployeeName(){
        Employee employee = new Employee("Juan", 5);
        Assert.assertEquals(employee.getName(), "Juan");
    }
}
