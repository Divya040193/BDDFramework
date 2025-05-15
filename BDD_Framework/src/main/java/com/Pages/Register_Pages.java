package com.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Pages {

	
	@FindBy(id="name") WebElement txtname;
	@FindBy(id="mobile")WebElement txtmobile;
	@FindBy(id="email")WebElement txtemail;
	@FindBy(id="password")WebElement txtpassword;
	@FindBy(xpath = "//*[@id=\"form\"]/div[5]/div/button")WebElement btnsignin;
	
	public Register_Pages(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
    }
	
	public void name(String UName) 
	{
		txtname.sendKeys(UName);
	}
	
	public void mobile(String UMobile) 
	{
		txtmobile.sendKeys(UMobile);
	}
	
	public void email(String Uemail) 
	{
		txtemail.sendKeys(Uemail);
	}
	
	
	public void password(String Upassword) 
	{
		txtpassword.sendKeys(Upassword);
	}
	
	public void clickbutton() 
	{
		btnsignin.click();
	}
	
	public String alertWindow(WebDriver driver) 
	{
		Alert al = driver.switchTo().alert();
		String alerttxt=al.getText();
		al.accept();
		
		return alerttxt;
	}
	
}


