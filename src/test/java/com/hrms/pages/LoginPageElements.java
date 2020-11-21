package com.hrms.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;
public class LoginPageElements extends BaseClass {
/*public  WebElement username= driver.findElement(By.id("txtUsername"));
public  WebElement password= driver.findElement(By.id("txtPassword"));
public  WebElement loginbutton= driver.findElement(By.id("btnLogin"));*/
@FindBy(id="txtUsername")
public WebElement username;

@FindBy(id="txtPassword")
public WebElement password;

@FindBy(id="btnLogin")
public WebElement loginbutton;
@FindBy(xpath="//span[@id='spanMessage']")
public WebElement Errormessagetext;

public  LoginPageElements() {

PageFactory.initElements(BaseClass.driver, this);
}}
