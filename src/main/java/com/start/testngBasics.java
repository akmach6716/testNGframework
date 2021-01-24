package com.start;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testngBasics {
	@BeforeClass
	public void systemlogin()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void systm()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void systemtesting()
	{
		System.out.println("system test");
	}
	@Test
	public void prioritytesting()
	{
		System.out.println("Priority Test");
	}
	@AfterMethod
	public void methodtesting()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void classtesting()
	{
		System.out.println("After class");
	}


}
