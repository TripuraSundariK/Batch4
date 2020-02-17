package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginComplexPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginComplexTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginComplexPOM loginComplexPOM;
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
		loginComplexPOM = new LoginComplexPOM(driver); 
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
	@Test(dataProvider="db-inputs",dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String login,String amount,String description) throws InterruptedException {
		loginComplexPOM.sendUserName("admin");
		loginComplexPOM.sendUserPassword();
		loginComplexPOM.btn1();
		loginComplexPOM.btn2();
		loginComplexPOM.btn3();
		loginComplexPOM.btn4();
		loginComplexPOM.clicksubmitbtn();
		 Thread.sleep(3000);
		 loginComplexPOM.memberusername("kumar");;
		 loginComplexPOM.Account();
		 loginComplexPOM.memberPayment();
		 loginComplexPOM.memberusername1("kumar");
		 loginComplexPOM.memberName("kumar");
		 loginComplexPOM.Amount(amount);
		 loginComplexPOM.Transection();
		 WebElement a=driver.findElement(By.id("type"));
		 Select sel=new Select(a);
		 sel.selectByValue("14");
		 loginComplexPOM.Description();
		 Thread.sleep(3000);
		 loginComplexPOM.Submit();
		 Thread.sleep(2000);
		 loginComplexPOM.FinalSubmit();
		
		
		
		
	}
}
