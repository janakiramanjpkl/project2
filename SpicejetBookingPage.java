package karthickProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetBookingPage {

	
	@FindBy(xpath="//]div[text()='one way'")
public static WebElement trip;
@FindBy(xpath="//div[text()='From']")
public static WebElement from;

	@FindBy(xpath="//div[@data-testid='to-testID-destination']")
	public static WebElement to;
	@FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
public static WebElement fromdate;
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, SpicejetBookingPage.class);
		
		
		SpicejetBookingPage.from.click();
		SpicejetBookingPage.from.sendKeys("chennai");
		SpicejetBookingPage.to.click();
		SpicejetBookingPage.to.sendKeys("Madurai");
		SpicejetBookingPage.fromdate.click();
		SpicejetBookingPage.fromdate.sendKeys("29-06-2023");
		
	}
	
}
