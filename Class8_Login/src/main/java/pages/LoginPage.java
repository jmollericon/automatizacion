package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver webDriver;
    private By userInput = By.id("user");
    private By passWordInput = By.id("pass");
    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void typeUserName(String username){
        webDriver.findElement(userInput).sendKeys(username);
    }

    public void typePassWord(String password){
        webDriver.findElement(passWordInput).sendKeys(password);
    }

    public EmployeePage clickOnLoginButton(){
        webDriver.findElement(loginButton).click();
        return new EmployeePage(webDriver);
    }

    public EmployeePage loginAs(String user, String password){
        typeUserName(user);
        typePassWord(password);
        return clickOnLoginButton();
    }
}
