package com.start;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlefileuploadpopups {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		    
	    driver.get("https://html.com/input-type-file/");
	    driver.manage().window().maximize();
	    driver.switchTo().activeElement();
	    Thread.sleep(2000);
	    driver.findElement(By.className("pm-dialog"));
	    System.out.println(driver.getTitle());
	}

}
