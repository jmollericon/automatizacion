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
        EmployeePage employeePage = loginPage.loginAs("admin","admin123");
        Assert.assertTrue(employeePage.isEmployeePageDisplayed());
    }
    @Test
    public void testUnsuccessfulLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        EmployeePage employeePage = loginPage.loginAs("admin","123");
        Assert.assertTrue(loginPage.isVisibleErrorMessage());
    }
}