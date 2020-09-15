package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private WebDriver webDriver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");
        System.out.println(webDriver.getTitle()); // Titulo de la página
        webDriver.manage().window().maximize();

        List<WebElement> elementList = webDriver.findElements(By.tagName("a"));
        System.out.println("Cantidad de links: " + elementList.size());

        WebElement element = webDriver.findElement(By.linkText("Inputs"));
        element.click();

        WebElement inputElement = webDriver.findElement(By.tagName("input"));
        inputElement.sendKeys("12345678");

        webDriver.quit(); // Cerrar navegador
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }

}
