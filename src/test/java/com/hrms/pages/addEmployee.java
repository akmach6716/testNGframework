package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;

public class addEmployee extends BaseClass {

@FindBy(id="menu_pim_viewPimModule")
public WebElement pimtab;
@FindBy(id="menu_pim_addEmployee")
public WebElement addemployee;
@FindBy(id="firstName")
public WebElement firstname;
@FindBy(id="middleName")
public WebElement middleName;
@FindBy(id="lastName")
public WebElement lastName;
@FindBy(id="employeeId")
public WebElement employeeId;
@FindBy(id="btnSave")
public WebElement btnSave;
@FindBy(id="personal_txtEmployeeId")
public WebElement aftersaveemployeeId;


public addEmployee() {

PageFactory.initElements(BaseClass.driver, this);
}



}
