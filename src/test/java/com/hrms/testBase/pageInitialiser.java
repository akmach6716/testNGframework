package com.hrms.testBase;

import com.hrms.pages.LoginPageElements;
import com.hrms.pages.addEmployee;

public class pageInitialiser extends BaseClass{
public static LoginPageElements login;
public static addEmployee emp;
public static void initialise()
{ 
	login=new LoginPageElements();
	emp= new addEmployee();
	
	}
}
