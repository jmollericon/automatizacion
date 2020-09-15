package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.ConfirmationPage;
import pages.PaymentPage;
import pages.ResultSearchPage;
import pages.SearchPage;

public class BaseTest {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.testfaceclub.com/aut-vuelos");

        SearchPage searchPage = new SearchPage(webDriver);
        ResultSearchPage resultSearchPage = searchPage.search(true,"Montevideo (MVD)","Buenos Aires (BUE)","06/25/2020",
                "09/10/2020","Primera","2");

        PaymentPage paymentPage = resultSearchPage.selectFirstTravel();

        ConfirmationPage confirmationPage = paymentPage.payTravel("Maestro","456678952359","123","10","2024",
                "Juan","Patricio","Cuba");

        webDriver.quit();
    }

    public static void main(String arg[]){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
