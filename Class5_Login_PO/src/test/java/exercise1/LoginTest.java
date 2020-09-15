package exercise1;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.List;

public class LoginTest {
    private WebDriver webDriver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.testfaceclub.com/ejercicios/");
        System.out.println(webDriver.getTitle()); // Titulo de la página
        webDriver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginAs("username", "password");

        // Login process
        /*WebElement inputUsername = webDriver.findElement(By.id("user"));
        inputUsername.sendKeys("username");
        WebElement inputPassword = webDriver.findElement(By.id("pass"));
        inputPassword.sendKeys("password");
        WebElement loginButton = webDriver.findElement(By.id("loginButton"));
        loginButton.click();*/

        // Add employee
        WebElement inputNameEmployee = webDriver.findElement(By.xpath("//*[@id='formEmployee']/div[2]/div[1]/input"));
        inputNameEmployee.sendKeys("Juan");

        WebElement inputEmailEmployee = webDriver.findElement(By.xpath("//*[@id='formEmployee']/div[2]/div[2]/input"));
        inputEmailEmployee.sendKeys("Juan@gmail.com");

        WebElement textAreaAddress = webDriver.findElement(By.id("address"));
        textAreaAddress.sendKeys("El Pinar, Cuidad de la Costa");

        WebElement inputPhone = webDriver.findElement(By.id("phone"));
        inputPhone.sendKeys("55589666");

        WebElement addButton = webDriver.findElement(By.id("addButton"));
        addButton.click();

        webDriver.quit(); // Cerrar navegador
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.setUp();
    }
}
