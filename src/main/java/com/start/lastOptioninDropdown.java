package com.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lastOptioninDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Aditya\\eclipse-workspace\\sanpleArti\\src\\main\\java\\config.properties");
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));

       driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("user1@talorg.com");

       driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password2!");

       driver.findElement(By.name("save")).click();
       
       driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.MILLISECONDS );
       Thread.sleep(9000);
       driver.findElement(By.xpath("/html/body/app-root/app-report-layout/div/div[2]/div/report-navigation/div/ul/li[3]")).click();
       
       //WebDriverWait wait=new WebDriverWait(driver, 20);
       
       //WebElement datamanagement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")))
       
       driver.switchTo().frame(0);
       
       



	}

}
