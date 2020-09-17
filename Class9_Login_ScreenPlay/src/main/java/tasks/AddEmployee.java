package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.EmployeeUI;
import ui.LoginUI;

public class AddEmployee {
    public static void add(WebDriver driver, String name, String email, String address, String phone){
        Enter.text(driver, EmployeeUI.nameInput, name);
        Enter.text(driver, EmployeeUI.emailInput, email);
        Enter.text(driver, EmployeeUI.addressInput, address);
        Enter.text(driver, EmployeeUI.phoneInput, phone);
        Click.on(driver, EmployeeUI.addEmployeeButton);
    }
}

