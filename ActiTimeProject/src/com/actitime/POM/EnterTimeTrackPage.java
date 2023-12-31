package com.actitime.POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
		@FindBy(id="logoutLink")
		private WebElement LoLk;
		
		@FindBy(xpath="//div[text()='Tasks']")
		private WebElement Tbtn;
		
		public EnterTimeTrackPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		}

		public void setLogOut() {
			Tbtn.click();	}
		public void setTasksTab() {
			Tbtn.click();
		}



}
