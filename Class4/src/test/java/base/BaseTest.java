package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver webDriver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();

        WebElement element = webDriver.findElement(By.linkText("Inputs"));
        element.click();

        WebElement inputElement = webDriver.findElement(By.tagName("input"));
        inputElement.sendKeys("12345678");
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }

}
