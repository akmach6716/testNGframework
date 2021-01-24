package TeluskoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends base {


@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")
public  WebElement usericon;

@FindBy(xpath="//*[@id=\"gb_71\"]")
public  WebElement signout;

public HomePage()
{
	
	PageFactory.initElements(driver, this);
	
	}

public void signout() throws InterruptedException
{
	
	usericon.click();
	 Thread.sleep(4000);
	 signout.click();
	 
	 
}
}
