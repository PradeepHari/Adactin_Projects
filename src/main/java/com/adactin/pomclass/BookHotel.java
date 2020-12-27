package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {

	public static WebDriver driver;
	
	public BookHotel(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(id="first_name")
     private WebElement fname;
     
     @FindBy(id="last_name")
     private WebElement lname;
     
     @FindBy(id = "address")
     private WebElement address;
     
     @FindBy(id="cc_num")
     private WebElement ccnumber;
     
     @FindBy(id="cc_type")
     private WebElement cctype;
     
     @FindBy(id="cc_exp_month")
     private WebElement ccexpmonth;
     
     @FindBy(id="cc_exp_year")
     private WebElement ccexpyear;
     
     @FindBy(id="cc_cvv")
     private WebElement cvvnumber;
     
     @FindBy(id="book_now")
     private WebElement booknow;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}
     
     
}
