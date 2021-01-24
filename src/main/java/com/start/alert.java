package com.start;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	    
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.manage().window().maximize();
    
    driver.findElement(By.name("proceed")).click();
    
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

alert.dismiss();
    
   // driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("user1@talorg.com");
    
    //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password2!");
//    driver.findElement(By.xpath("//*[@id=\"vForm\"]/form/div[4]/input")).click();
	}
}
