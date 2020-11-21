package com.hrms.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.Utils.CommonMethods;
import com.hrms.Utils.ConfigReader;
import com.hrms.Utils.ExcelReader;
import com.hrms.testBase.pageInitialiser;

public class addemployeetest extends pageInitialiser {
	@Test(dataProvider="DatafromEXcel")
	public static void addemployee(String firstname,String middlename,String lastname)
	{
		SoftAssert sa= new SoftAssert();
		CommonMethods.sendData(login.username, ConfigReader.getproperty("userName"));
		CommonMethods.sendData(login.password, ConfigReader.getproperty("password"));
		CommonMethods.clickAction(login.loginbutton);
		CommonMethods.clickAction(emp.pimtab);
		CommonMethods.clickAction(emp.addemployee);
		CommonMethods.sendData(emp.firstname, firstname);
		CommonMethods.sendData(emp.middleName, middlename);
		CommonMethods.sendData(emp.lastName, lastname);
		String Expectedeid=emp.employeeId.getAttribute("value");
		System.out.println(Expectedeid);
		CommonMethods.clickAction(emp.btnSave);
		CommonMethods.waitforVisibility(emp.aftersaveemployeeId);
		String Actualeid=emp.aftersaveemployeeId.getAttribute("value");
		
		  sa.assertEquals(Expectedeid, Actualeid,"Result not matching");
		  System.out.println("Test Passed");
		  sa.assertAll(); 
		 
		
	}
	
	@DataProvider(name="DatafromEXcel")
	
	public Object[][] getData()
	{
		return ExcelReader.exceltoArray("E:\\TestData2.xlsx","Sheet1");
	}
}
