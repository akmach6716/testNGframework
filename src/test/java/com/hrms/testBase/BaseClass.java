package com.hrms.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.hrms.Utils.ConfigReader;
import com.hrms.Utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports report;
	public static ExtentTest test;
    @BeforeTest(alwaysRun=true)
	public void generateReport() {
		ConfigReader.readProperties(Constants.FilePath);
		htmlreport = new ExtentHtmlReporter(Constants.EXTENT_REPORT_PATH);
		htmlreport.config().setDocumentTitle(ConfigReader.getproperty("ReportTitle"));
		htmlreport.config().setReportName(ConfigReader.getproperty("ReportName"));
		htmlreport.config().setTheme(Theme.DARK);
		report=new  ExtentReports();
		report.attachReporter(htmlreport);
	}
    @AfterTest(alwaysRun=true)
	public void writereport()
	{report.flush();		
	}

	@BeforeMethod
	public static WebDriver setup() {
		ConfigReader.readProperties(Constants.FilePath);
		switch (ConfigReader.getproperty("BrowserName")) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			//System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_PATH);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			//System.setProperty("webdriver.ie.driver", Constants.IE_PATH);
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			throw new RuntimeException("Given the invalid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConfigReader.getproperty("url"));
		pageInitialiser.initialise();
		return driver;
	}

	@AfterMethod
	public static void teardown() {
		if (driver != null)
			driver.quit();
	}
}
