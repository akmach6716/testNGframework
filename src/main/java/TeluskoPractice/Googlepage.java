package TeluskoPractice;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample1.sanpleArti.google;

public class Googlepage extends base  {

  // public WebDriver driver;
   
	@FindBy(xpath="//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")
	public   WebElement gmaillink;
	

	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	public  WebElement signinbutton;
	

	//@FindBy(xpath="By.id(\"identifierId\")")

	@FindBy(id="identifierId")
	public  WebElement email;
	

	//@FindBy(xpath="//*[@id=\"identifierId\"]")
	@FindBy(id="identifierNext")
	public  WebElement nextuname;
	
	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
	public  WebElement password;
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/span/span")
	
	public   WebElement nextpwd;
	
	
	
	public Googlepage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void gmailclick()
	
	{
	
	gmaillink.click();
	}
	
	
	public HomePage login() throws InterruptedException
	{
		signinbutton.click();
		 Thread.sleep(4000);
		 
		ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
		if (!availableWindows.isEmpty()) { 
		driver.switchTo().window(availableWindows.get(1)); 
		}
	
		email.sendKeys("akval2019");
		 Thread.sleep(4000);
		nextuname.click();
		 Thread.sleep(4000);
		password.sendKeys("Welcome*1234");
		 Thread.sleep(4000);
		nextpwd.click();
		 Thread.sleep(4000);
		
		return new HomePage();
	}
	
}
