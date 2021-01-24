package sample1.sanpleArti;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import TeluskoPractice.Googlepage;
import TeluskoPractice.HomePage;
import TeluskoPractice.base;

public class google extends base  {


	Googlepage pc=new Googlepage();
	HomePage hp=new HomePage();

	
	@Test
	public void verifytitle( ) throws InterruptedException
	{
		

		Googlepage pc=new Googlepage();
		HomePage hp=new HomePage();	

		  //driver.findElement(By.cssSelector("#email")).sendKeys("admin@manualtableaureprots.com");
		  Thread.sleep(4000);
		pc.gmailclick();
	   hp=pc.login();
	   hp.signout();
		  System.out.println(driver.getCurrentUrl());
		   System.out.println(driver.getTitle());
	  
	 
	
           //String s=driver.getTitle();
           //Assert.assertEquals(s, "Gmail - Free Storage and Email from Google","Test PASS");
           Assert.assertTrue(driver.getTitle().contains("Gmail"));
           
           
	}
	
	

}
