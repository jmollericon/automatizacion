package employee;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.AddEmployee;
import tasks.IsAlertSuccessAddEmployee;
import tasks.IsEmployeePageDisplayed;
import tasks.Login;

public class EmployeeTest extends BaseTest {
    @Test
    public void testSuccessfulLogin(){
        Login.as(webDriver,"admin","admin123");
        AddEmployee.add(webDriver, "Juan", "juan@email.com", "Calle Z", "222222");
        Assert.assertTrue(IsAlertSuccessAddEmployee.present(webDriver));

    }
}
