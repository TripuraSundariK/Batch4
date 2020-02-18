
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ContactAndPaymentPOM;
import com.training.pom.LoginMediumPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginMediumTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginMediumPOM loginPOM;
	private ContactAndPaymentPOM contactPOM;
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
		loginPOM = new LoginMediumPOM(driver);
		contactPOM =new ContactAndPaymentPOM(driver);
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
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("prem96");
		loginPOM.password1();
		loginPOM.password2();
		loginPOM.password3();
		loginPOM.password4();
		loginPOM.clickLoginBtn();
		contactPOM.personalBtn();
		contactPOM.contactsBtn();
		contactPOM.memloginCb();
	//	loginPOM.memNameCb();
		contactPOM.submitBtn();
		Thread.sleep(3000);
		contactPOM.AlertHandler();
		contactPOM.contactList();
		contactPOM.payBtn();
		contactPOM.amountCb();
		contactPOM.description();
		contactPOM.subBtn();
		contactPOM.transactionConfirm();
		contactPOM.toMemberBtn();
		//screenShot.captureScreenShot("First");
	}
	
}
