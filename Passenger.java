package karthickProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Passenger {

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
		WebElement city=driver.findElement(By.xpath("//div[text()='BOM']"));
		city.click();
		Thread.sleep(4000);
		WebElement city1=driver.findElement(By.xpath("//div[text()='DEL']"));
		city1.click();
		
		WebElement date=driver.findElement(By.xpath("//div[@data-testid='undefined-month-June-2023']//div[text()='13']"));
		date.click();
		
		
		WebElement sub=driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		sub.click();
		
		Thread.sleep(9000);
		
		WebElement cbutton=driver.findElement(By.xpath("//div[@style='background-image: linear-gradient(rgb(252, 182, 62), rgb(247, 148, 29)); padding-right: 38px; padding-left: 38px;']"));
		cbutton.click();
		Thread.sleep(8000);
		WebElement firstname=driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']"));
		firstname.click();
		firstname.sendKeys("janakiraman");
		
		
		WebElement lastname=driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']"));
		lastname.click();
		lastname.sendKeys("p");
		
		
		WebElement phone=driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']"));
		phone.click();
		phone.sendKeys("9080766778");
		
		WebElement mailid=driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']"));
		mailid.click();
		mailid.sendKeys("karthickjpkl@gmail.com");
		
		WebElement city2=driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']"));
		city2.click();
		city2.sendKeys("chennau");
		
		WebElement che=driver.findElement(By.xpath("//div[text()='I am flying as the primary passenger']"));
		che.click();
		
		WebElement con=driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']"));
		con.click();
		
	}

}
