package jsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class removeLogs {
	public static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditya\\eclipse-workspace\\sanpleArti\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.logfile", "C:\\Users\\Aditya\\eclipse-workspace\\sanpleArti\\logs.txt");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/");
		 System.out.println(driver.getTitle());
		 driver.quit();

	}

}
