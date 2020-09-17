package tasks;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.EmployeeUI;

public class IsAlertSuccessAddEmployee {
    public static boolean present(WebDriver webDriver){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 3);
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
