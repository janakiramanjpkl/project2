package karthickProject2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Baseclass extends SpicejetLoginPage {
@FindBy(xpath="//div[text()='Login']")
public static WebElement loginbutton;

@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
public static WebElement phonenumber;

@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
public static WebElement password;

@FindBy(xpath="//div[@data-testid='login-cta']")
public static WebElement login;
}
