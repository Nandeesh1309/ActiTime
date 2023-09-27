package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskListPage;
import com.actitime.POM.TaskListPage2;
import com.actitime.generic.BaseClase;
import com.actitime.generic.FileLib;

//@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClase{

/*	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String customerName = f.getexceldata("CreateCustomer", 1, 2);
	String customerDesc = f.getexceldata("CreateCustomer", 1, 3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTasksTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getEnterCustNameTbx().sendKeys(customerName);
	t.getEnterCustDescriptionTbx().sendKeys(customerDesc);
	t.getSelectCustomerDD().click();
	t.getBigBangCompanyTx().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	String actualCustomerText = t.getActualCustomer().getText();
//	Assert.assertEquals(actualCustomerText, customerName);
	}*/
	@Test
	public void testProjectCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("CreateProject",true);
	FileLib f=new FileLib();
	String ProjectName = f.getexceldata("CreateCustomer", 2, 2);
	String ProjectDesc = f.getexceldata("CreateCustomer", 3, 3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTasksTab();
	TaskListPage2 tl=new TaskListPage2(driver);
	Thread.sleep(2000);
	tl.getAddNewBtn().click();
	Thread.sleep(2000);
	tl.getNewProjectOption().click();
	Thread.sleep(2000);
	tl.getEnterProjNameTbx().sendKeys(ProjectName);
	Thread.sleep(2000);
	tl.getCustomerTbx().click();
	Thread.sleep(2000);
	tl.getSelectHDFCDD().click();
	Thread.sleep(2000);
	tl.getEnterProjDescriptionTbx().sendKeys(ProjectDesc);
	Thread.sleep(2000);
	tl.getCreateProjectBtn().click();
	Thread.sleep(2000);
	}
}
