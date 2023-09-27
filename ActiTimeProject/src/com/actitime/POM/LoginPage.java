package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement UntBx;
	
	@FindBy(name="pwd")
	private WebElement PwtBx;                  //declarization
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LgBtn;
	
	
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);   //initilization
	}
	
	 public void SetLogin(String Un,String PWD) {
		 UntBx.sendKeys(Un);
		 PwtBx.sendKeys(PWD);                          //utalization
		 LgBtn.click();
		 
	 }

}
