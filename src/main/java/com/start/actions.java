package com.start;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/default.aspx");
	    driver.manage().window().maximize();	     
		/*
		 * Actions a = new Actions(driver);
		 * a.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))
		 * ).build().perform(); driver.close();
		 */	
		
	    driver.get("https://jqueryui.com/droppable/");
	    Thread.sleep(5000);
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	   //System.out.println(driver.findElement(By.xpath("//*[@id='draggable']")).getText());	    
	   Actions a = new Actions(driver);
a.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='draggable']"))).release().build().perform();
	    
	    System.out.println(driver.getCurrentUrl());
		
		
	}

}
