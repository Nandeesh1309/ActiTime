package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage2 {
	@FindBy(xpath="//div[@class='downIcon']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectOption;
	
	@FindBy(xpath="//input[@ placeholder='Enter Project Name' and @class]")
	private WebElement enterProjNameTbx;
	
	@FindBy(xpath="//div[@class='inputPlaceholder' ]/input[@type='text']")
	private WebElement CustomerTbx;
	
	@FindBy(xpath="//div[text()='HDFC_0001' ]")
	private WebElement SelectHDFCDD;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjDescriptionTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	public TaskListPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewProjectOption() {
		return newProjectOption;
	}

	public WebElement getEnterProjNameTbx() {
		return enterProjNameTbx;
	}

	public WebElement getCustomerTbx() {
		return CustomerTbx;
	}

	public WebElement getSelectHDFCDD() {
		return SelectHDFCDD;
	}

	public WebElement getEnterProjDescriptionTbx() {
		return enterProjDescriptionTbx;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

}
