package TeluskoPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class base {
	

	
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeTest
	public void browserlaunch(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("Opening Chrome");
		} else if(browser.equalsIgnoreCase("Mozilla"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	        driver=new FirefoxDriver();
	        System.out.println("Opening Firefox");
		}else if (browser.equalsIgnoreCase("IE"))
        {
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
        //DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        //cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        driver = new InternetExplorerDriver();
        //System.out.println("Opening IE");
        }
		
		
		driver.manage().window().maximize();
        driver.get("https://google.co.in");      
        //System.out.println(driver.getTitle());
       // driver.findElement(By.id("email")).sendKeys("admin@manualtableaureprots.com");
	}
	 @AfterTest
	 public void closedriver()
	 {
		 //driver.close();
		 driver.quit();
		 System.out.println("Closed");
	 }
	
}
