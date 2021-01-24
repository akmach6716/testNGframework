package com.start;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class googleTest {

	WebDriver driver;
	@Test(priority=1)
	@Parameters({"url"})
	public void setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(url);		
	}	
	@Test(priority=2,groups="same")
	public void verifytitle()
	{		
				Assert.assertEquals(driver.getTitle(), "Google","Title is not matched");
	}	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
