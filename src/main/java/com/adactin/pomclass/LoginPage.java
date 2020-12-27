package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	@FindBy(id ="username")
	private WebElement mailid;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id = "login")
	private WebElement login;

	public LoginPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
		
	}


	public WebElement getMailid() {
		return mailid;
	}
	

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
