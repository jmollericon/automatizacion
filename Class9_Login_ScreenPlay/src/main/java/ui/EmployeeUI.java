package ui;

import org.openqa.selenium.By;

public class EmployeeUI {
    public static By form = By.id("formEmployee");
    public static By nameInput = By.xpath("//*[@id='formEmployee']/div[2]/div[1]/input");
    public static By emailInput = By.xpath("//*[@id='formEmployee']/div[2]/div[2]/input");
    public static By addressInput = By.id("address");
    public static By phoneInput = By.id("phone");
    public static By addEmployeeButton = By.id("addButton");
    public static By formEmployee = By.id("formEmployee");
}