package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
public static WebDriver driver;

	public SelectHotel(WebDriver driver3) {
		this.driver= driver3;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement SelectHotel;
	

	@FindBy(id = "continue")
	private WebElement ContinueButton;
	

	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	
}
