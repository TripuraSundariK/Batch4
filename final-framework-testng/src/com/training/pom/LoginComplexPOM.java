package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginComplexPOM {
	private WebDriver driver; 
	
	public LoginComplexPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername; 
	
	public void sendUserName(String admin) {
		this.cyclosUsername.clear();
		this.cyclosUsername.sendKeys(admin);
	}

	
	@FindBy(id="cyclosPassword")
	private WebElement cyclosPassword;
	public void sendUserPassword() {
		this.cyclosPassword.click();;
	}

	
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement btn1;
	public void  btn1() {
		this.btn1.click(); 
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement btn2;
	public void btn2() {
		this.btn2.click(); 
	}
	
	
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement btn3;

	public void btn3() {
		this.btn3.click(); 
	}
	
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement btn4;
	public void btn4() {
		this.btn4.click(); 
	}
	
	
	
	@FindBy(xpath="//tr//td//td//input[@value='Submit']")
	private WebElement submitlogin; 
	public void clicksubmitbtn() {
		this.submitlogin.click(); 
	}
	
	
	@FindBy(id="memberUsername")
	private WebElement memberUsername;
	public void memberUsername(){
		this.memberUsername.click();
	}
	
	@FindBy(xpath="//li[@id='menu3']/span[@class='menuText']")
	private WebElement Account;
	public void Account() {
		this.Account.click(); 
	}
	
	
	@FindBy(xpath="//li[@id='submenu3.6']/span[@class='subMenuText']")
	private WebElement memberPayment;
	public void memberPayment() {
		this.memberPayment.click(); 
	}
	
	
	@FindBy(id="memberUsername")
	private WebElement memberusername1; 
	public void memberusername1(String memberusername){
		this.memberusername1.sendKeys("kumar");
	}
	@FindBy(id="memberName")
	private WebElement memberName; 
	public void memberName(String memberName){
		this.memberName.sendKeys("kumar");
	}
	
	
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement amount;
	public void Amount(String amount) {
		this.amount.sendKeys("500"); 
	}
	
	
	@FindBy(id="type")
	private WebElement Transection;
	public void Transection() {
		this.Transection.click();
		}
	
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Description; 
	public void Description() {
		this.Description.sendKeys("I need 5000Loan"); 
	}
	
	
	
	@FindBy(id="submitButton")
	private WebElement Submit; 
	public void Submit() {
		this.Submit.click(); 
	}

	
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement FinalSubmit; 
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	public void FinalSubmit() {
		this.FinalSubmit.click(); 
	}

	

}
