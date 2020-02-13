package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AccountInforPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AccountInforPOM accInfoPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		accInfoPOM= new AccountInforPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws Exception {
		loginPOM.sendUsername("Piku");
		
		loginPOM.password1();
		loginPOM.password2();
		loginPOM.password3();
		loginPOM.password4();
		loginPOM.clickLoginBtn();
		Thread.sleep(3000);
		accInfoPOM.clickAccount();
		accInfoPOM.accountInformation();
		accInfoPOM.modeButton();
		accInfoPOM.memberUsername("Piku");
		Thread.sleep(2000);
		accInfoPOM.description("trying");
		accInfoPOM.sel1();
		accInfoPOM.memberName("Piku");
		accInfoPOM.dateBox("12/02/2019");
		accInfoPOM.dateBox1("09/25/2020");
		
		accInfoPOM.submitBtn1();
		
		Thread.sleep(3000);
		
		screenShot.captureScreenShot("First");
		
	}
}
