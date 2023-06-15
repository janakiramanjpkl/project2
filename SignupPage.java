package karthickProject2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://spiceclub.spicejet.com/signup");
		driver.manage().window().maximize();
	
	WebElement title=driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
	
	Select select=new Select(title);
	select.selectByIndex(1);

	WebElement firstname=driver.findElement(By.id("first_name"));
	firstname.click();
	firstname.sendKeys("janakiraman");
	WebElement lasttname=driver.findElement(By.id("last_name"));
	lasttname.click();
	lasttname.sendKeys("p");
	JavascriptExecutor je=(JavascriptExecutor) driver;
	
	je.executeScript("window.scrollBy(0,13000)", "");
	
	WebElement date=driver.findElement(By.id("dobDate"));
	date.click();
	WebElement clickdate=driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, June 5th, 2005']"));
	clickdate.click();
	
	
	WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
	phone.click();
	phone.sendKeys("9080566975");
	WebElement mail=driver.findElement(By.id("email_id"));
	mail.click();
	mail.sendKeys("karthickjpkl@gmail.om");
	//je.executeScript("arguments[0].ScrollIntoView();", mail);
	Thread.sleep(5000);
	
	
	
	
	WebElement newpass=driver.findElement(By.id("new-password"));
	newpass.click();
	newpass.sendKeys("Abi@jani1234567890");
	
	WebElement cpass=driver.findElement(By.id("c-password"));
	cpass.click();
	cpass.sendKeys("Abi@jani1234567890");
	
	WebElement check=driver.findElement(By.id("defaultCheck1"));
	check.click();
	WebElement sub=driver.findElement(By.xpath("//button[text()='Submit']"));
	sub.click();
	
	
	
	}

}
