package com.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readpropfile {

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
driver.get(pro.getProperty("url"));

//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("user1@talorg.com");

//driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password2!");

// driver.findElement(By.name("save")).click();

	}

}
