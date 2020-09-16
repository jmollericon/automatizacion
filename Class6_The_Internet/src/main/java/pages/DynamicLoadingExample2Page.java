package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {
    private WebDriver webDriver;
    private By startButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadedText = By.xpath("//*[@id=\"finish\"]/h4"); // para verificar si está visible el texto que muestra que se termino de cargar

    public DynamicLoadingExample2Page(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void clickOnStartButton(){
        webDriver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText(){
        return webDriver.findElement(loadedText).getText();
    }
}
