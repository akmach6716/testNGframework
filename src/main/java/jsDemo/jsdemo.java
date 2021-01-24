package jsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jsdemo {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Aditya\\eclipse-workspace\\sanpleArti\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://login.yahoo.com/");
		 driver.findElement(By.id("login-username")).sendKeys("fhjgu@gmail.com");
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("document.getElementById('persistent').click()");
		
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
		 
		 

	}

}
