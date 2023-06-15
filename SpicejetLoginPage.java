package karthickProject2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetLoginPage {
	public static WebDriver driver;
public static void main(String args[]) throws Exception {
	System.out.println("hello");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();




PageFactory.initElements(driver, Baseclass.class);
Baseclass.loginbutton.click();
Baseclass.phonenumber.click();
Baseclass.phonenumber.sendKeys("9080566975");
Baseclass.password.click();
Baseclass.password.sendKeys("Abi@jani1234567890");
Baseclass.login.click();

}
}
