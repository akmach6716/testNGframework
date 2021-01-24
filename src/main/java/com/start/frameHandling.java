package com.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		    
	    driver.get("https://qa.voyanta.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("user1@talorg.com");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password2!");
        driver.findElement(By.xpath("//*[@id=\"vForm\"]/form/div[4]/input")).click();
        Thread.sleep(9000);
        
        driver.findElement(By.xpath("//*[@id=\"__test__\"]/li[2]/i")).click();
        
        Thread.sleep(6000);
        
        driver.findElement(By.xpath("//*[@id='reportGroupList']/li[2]")).click();
        
        
        
	}

}
