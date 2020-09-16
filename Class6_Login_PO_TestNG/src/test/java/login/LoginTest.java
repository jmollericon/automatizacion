package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        EmployeePage employeePage = loginPage.loginAs("username","password");
        Assert.assertTrue(employeePage.isEmployeePageDisplayed(), "La página del empleado no se muestra.");
    }
}
