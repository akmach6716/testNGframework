package com.hrms.testCases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.Utils.CommonMethods;
import com.hrms.Utils.ConfigReader;
import com.hrms.pages.LoginPageElements;
import com.hrms.testBase.BaseClass;
import com.hrms.testBase.pageInitialiser;
public class loginTest extends pageInitialiser  {
	@Test
	public static void ValidCredentials()
	{  	SoftAssert sa= new SoftAssert();
		CommonMethods.sendData(login.username, ConfigReader.getproperty("userName"));
		CommonMethods.sendData(login.password, ConfigReader.getproperty("password"));
		CommonMethods.clickAction(login.loginbutton);
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		sa.assertEquals(actualTitle, expectedTitle,"Result not matching");
		sa.assertAll();
		System.out.println("come here after execution");	
		
	}
	@Test
	public static void InvalidCredentials_001()
	{
		SoftAssert sa= new SoftAssert();
		CommonMethods.sendData(login.username, "admin009");
		CommonMethods.sendData(login.password, "iosifoif");
		CommonMethods.clickAction(login.loginbutton);
		String actualText=login.Errormessagetext.getText();
		System.out.println("actualText "+actualText);
		String expectedText="Invalid credentials";
		//span[@id='spanMessage']
		sa.assertEquals(actualText, expectedText,"Result not matching");
		sa.assertAll();
		System.out.println("come here after execution");
		
	}
	@Test
	public static void InvalidCredentials_002()
	{
		SoftAssert sa= new SoftAssert();
		CommonMethods.sendData(login.username, "admin009");
		CommonMethods.sendData(login.password, "iosifoif");
		CommonMethods.clickAction(login.loginbutton);
		String actualText=login.Errormessagetext.getText();
		System.out.println("actualText "+actualText);
		String expectedText="Invalid credentials";
		//span[@id='spanMessage']
		sa.assertEquals(actualText, expectedText,"Result not matching");
		sa.assertAll();
		System.out.println("come here after execution");
		
	}
	@Test
	public static void InvalidCredentials_003()
	{
		SoftAssert sa= new SoftAssert();
		CommonMethods.sendData(login.username, "");
		CommonMethods.sendData(login.password, "");
		CommonMethods.clickAction(login.loginbutton);
		String actualText=login.Errormessagetext.getText();
		System.out.println("actualText "+actualText);
		String expectedText="Username cannot be empty";
		//span[@id='spanMessage']
		sa.assertEquals(actualText, expectedText,"Result not matching");
		sa.assertAll();
		System.out.println("come here after execution");
		
	}
}
