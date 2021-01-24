package com.start;

import org.testng.annotations.Test;

public class testNGfeatures {
	@Test
	public void loginpagetest()
	{
		System.out.println("Loginpage test");		
	}	
	@Test(invocationCount=5,expectedExceptions=NumberFormatException.class)
	public void homepagetest()
	{
		System.out.println("homepagetest");
		String x="12A";
		Integer.parseInt(x);		
	}
	@Test(dependsOnMethods="loginpagetest")
	public void searchpagetest()
	{
		System.out.println("searchpagetest");
	}
}


