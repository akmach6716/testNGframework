package testUtils;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
       driver.get("http://qa.voyanta.com");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("user1@talorg.com");
       
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password2!");
       driver.findElement(By.xpath("//*[@id=\"vForm\"]/form/div[4]/input")).click();
       Thread.sleep(8000);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("scroll(0,650)");
    driver.findElement(By.xpath("//*[@id=\"vizContainer\"]/app-report-toolbar/div[2]/div/i")).click();
       Thread.sleep(3000);
       //js.executeScript("scroll(0,-700)");
       Thread.sleep(1000);
      driver.close();
       
       
	}

}
