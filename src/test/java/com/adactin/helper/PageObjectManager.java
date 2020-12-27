package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pomclass.BookHotel;
import com.adactin.pomclass.LogOutPage;
import com.adactin.pomclass.LoginPage;
import com.adactin.pomclass.SearchHotelPage;
import com.adactin.pomclass.SelectHotel;

public class PageObjectManager {
	
	
	public WebDriver driver;
	private LoginPage lg;
	private SearchHotelPage shp;
	private  SelectHotel sh;
	private BookHotel bh;
	private  LogOutPage lp;
	
	
	
	  
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
				
	}
	public LoginPage getLogin() {
		 lg = new LoginPage(driver);
		 return lg;
	}
	
	public SearchHotelPage getSearchHotel() {
	  shp = new SearchHotelPage(driver);
	  return shp;
	  }
	
	 public SelectHotel getSelectHotel() {
		  sh = new SelectHotel(driver);
		  return sh;
	}
	 
	 public BookHotel getBookHotelPage() {
		  bh = new BookHotel(driver);
		  return bh;
	}
	
	 public LogOutPage getLogOutPage() {
		  lp = new LogOutPage(driver);
		  return lp;


	}
	
	
	
	
	
	
	
	
	
	
	
}
