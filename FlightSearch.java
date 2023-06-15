package karthickProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement trip=driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']"));
		trip.click();
		System.out.println(trip.getText());
		System.out.println(trip.isSelected());
		
		WebElement from=driver.findElement(By.xpath("//div[text()='From']"));
		from.click();
		WebElement city=driver.findElement(By.xpath("//div[text()='Chennai']"));
		city.click();
		Thread.sleep(4000);
		WebElement city1=driver.findElement(By.xpath("//div[text()='AMD']"));
		city1.click();
		
		WebElement date=driver.findElement(By.xpath("//div[@data-testid='undefined-month-June-2023']//div[text()='13']"));
		date.click();
		
		
		WebElement sub=driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		sub.click();
		
		
		
		WebElement box=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-zso239']"));
		box.click();
		
		
		}

}
