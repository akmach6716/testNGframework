package com.start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooflinksinpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//driver.get("https://qa.voyanta.com/");
        driver.get("https://www.amazon.in/");           
	    driver.manage().window().maximize();
	    
	    //driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("user1@talorg.com");
	    
	    //driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password2!");
	    
	   // driver.findElement(By.name("save")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    List<WebElement>l= driver.findElements(By.tagName("a"));
	    System.out.println(l.size());
	    
	    for(int i=0;i<l.size();i++)
	    {
	    	System.out.println(l.get(i).getText());
	    }
	  
	}

}
