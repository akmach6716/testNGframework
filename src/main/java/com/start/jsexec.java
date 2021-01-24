package com.start;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexec {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript(script, args)
	}

}
 