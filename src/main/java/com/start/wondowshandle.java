package com.start;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wondowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.popuptest.com/goodpopups.html");  
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[4]")).click();
        
        Set<String> s=driver.getWindowHandles();
        
        for (String handle : s) 
        {
			System.out.println(handle);
			//You have to explicitly switch to the 
			driver.switchTo().window(handle);
			System.out.println(driver.getCurrentUrl());
			driver.close();

		}

        
        /*terator <String> it = s.iterator();
       String parentwindow= it.next();
*/

        
        
	}

}
