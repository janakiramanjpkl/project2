package karthickProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoundtripSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement roundtrip=driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']"));
		roundtrip.click();
		System.out.println(roundtrip.getText());
		WebElement from=driver.findElement(By.xpath("//div[text()='From']"));
		from.click();
		WebElement city=driver.findElement(By.xpath("//div[text()='Chennai']"));
		city.click();
		Thread.sleep(4000);
		WebElement city1=driver.findElement(By.xpath("//div[text()='IXA']"));
		city1.click();
		
		WebElement date=driver.findElement(By.xpath("//div[@data-testid='undefined-month-June-2023']//div[text()='13']"));
		date.click();
		Thread.sleep(2000);
	WebElement returndate=driver.findElement(By.xpath("//div[@data-testid='undefined-month-July-2023']//div[text()='1']"));
	returndate.click();
	
	
	WebElement sub=driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
	sub.click();
	
	
	
	
	
	
	
	}

}
