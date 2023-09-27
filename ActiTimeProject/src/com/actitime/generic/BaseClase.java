package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.LoginPage;

public class BaseClase {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f = new FileLib();
		String url = f.getpropertydata("Url");
		String un = f.getpropertydata("Username");
		String pw = f.getpropertydata("password");
		driver.get(url);
		LoginPage L=new LoginPage(driver);
		L.SetLogin(un, pw);
	
		}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogOut();
		
		}
/*	@AfterTest
	public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
		} */

}
