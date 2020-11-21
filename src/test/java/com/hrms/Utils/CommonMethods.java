package com.hrms.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;
import com.hrms.testBase.BaseClass;

public class CommonMethods {
	public static void sendData(WebElement ele, String Text) {
		waitforVisibility(ele);
		ele.clear();
		ele.sendKeys(Text);
	}

	public static void clickAction(WebElement ele) {
		isElementPresent(ele);
		waitforElementTobeClickable(ele);
		ele.click();
	}

	public static String takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		String destination = Constants.SCREENSHOT_PATH + filename + getTimestamp() + ".png";
		try {
			FileUtils.copyFile(fs, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static String getTimestamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY_mm_dd_hh_mm_ss");
		return sdf.format(date.getTime());
	}

	public static WebDriverWait getobjectwait() {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 60);
		return wait;
	}

	public static WebElement waitforVisibility(WebElement ele) {
		return getobjectwait().until(ExpectedConditions.visibilityOf(ele));

	}

	public static WebElement waitforElementTobeClickable(WebElement ele) {
		return getobjectwait().until(ExpectedConditions.elementToBeClickable(ele));

	}

	public static JavascriptExecutor getjsobject() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		return js;
	}

	public static void jsclick(WebElement ele) {
		getjsobject().executeScript("arguemnts[0].click()", ele);
	}

	public static boolean isElementPresent(WebElement ele) {
		if (ele.isDisplayed()) {
			return true;
		} else {
			System.out.println(ele + " is not present");
			return false;
		}

	}
}
