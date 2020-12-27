package com.cucumber.stepdefinitionforpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pomclass.BookHotel;
import com.adactin.pomclass.LogOutPage;
import com.adactin.pomclass.LoginPage;
import com.adactin.pomclass.SearchHotelPage;
import com.adactin.pomclass.SelectHotel;
import com.cucumber.runner.RunnerDemo;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionpom extends BaseClass {

	public static WebDriver driver = RunnerDemo.driver;

	public static PageObjectManager pom = new PageObjectManager(driver);

	/*
	 * LoginPage lg = new LoginPage(driver); SearchHotelPage shp = new
	 * SearchHotelPage(driver); SelectHotel sh = new SelectHotel(driver); BookHotel
	 * bh = new BookHotel(driver); LogOutPage lp = new LogOutPage(driver);
	 */

	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName:   " + name);
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("   ScenarioStatus:   " + status);

		if (scenario.isFailed()) {
			TakesScreenshot(scenario.getName());

		}

	}

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {

		String url = FileReaderManager.getInstance().getInstancereader().geturl();
		getUrl(url);

		/*
		 * geturl("http://adactinhotelapp.com/");
		 */ }

	@When("^User enter the \"([^\"]*)\" in username field$")
	public void user_enter_the_in_username_field(String username) throws Throwable {
		inputvaluetoElement(pom.getLogin().getMailid(), username);
	}

	@When("^User enter the \"([^\"]*)\" in password field$")
	public void user_enter_the_in_password_field(String password) throws Throwable {
		inputvaluetoElement(pom.getLogin().getPwd(), password);
	}
	/*
	 * @When("^User enter the username in username field$") public void
	 * user_enter_the_username_in_username_field() throws Throwable {
	 * 
	 * inputvaluetoElement(pom.getLogin().getMailid(), "PradeepHari");
	 * 
	 * inputvaluetoElement(lg.getMailid(), "PradeepHari"); }
	 * 
	 * @When("^User enter the password in password field$") public void
	 * user_enter_the_password_in_password_field() throws Throwable {
	 * 
	 * inputvaluetoElement(pom.getLogin().getPwd(), "Pradeep123"); //
	 * inputvaluetoElement(lg.getPwd(), "Pradeep123"); }
	 */

	@Then("^User click the login button and to check it navigates to next page$")
	public void user_click_the_login_button_and_to_check_it_navigates_to_next_page() throws Throwable {
		click(pom.getLogin().getLogin());
		// click(lg.getLogin());

	}

	@When("^User launch the location$")
	public void user_launch_the_location() throws Throwable {

		dropdown(pom.getSearchHotel().getLocation(), "index", "3");
		// dropdown(shp.getLocation(), "index", "3");

	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		dropdown(pom.getSearchHotel().getHotels(), "index", "1");
		// dropdown(shp.getHotels(), "index", "1");
	}

	@When("^user select the roomtype$")
	public void user_select_the_roomtype() throws Throwable {
		dropdown(pom.getSearchHotel().getRoomtype(), "index", "1");
		// dropdown(shp.getRoomtype(), "index", "1");
	}

	@When("^user select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		dropdown(pom.getSearchHotel().getRoomnos(), "index", "2");
		// dropdown(shp.getRoomnos(), "index", "2");
	}

	@When("^user select the check in date$")
	public void user_select_the_check_in_date() throws Throwable {
		pom.getSearchHotel().getDatepickin().clear();
		inputvaluetoElement(pom.getSearchHotel().getDatepickin(), "29/12/2020");
		// shp.getDatepickin().clear();
		// inputvaluetoElement(shp.getDatepickin(), "29/12/2020");
	}

	@When("^user select the check out date$")
	public void user_select_the_check_out_date() throws Throwable {
		pom.getSearchHotel().getDatepickout().clear();
		inputvaluetoElement(pom.getSearchHotel().getDatepickout(), "01/01/2021");
		// shp.getDatepickout().clear();
		// inputvaluetoElement(shp.getDatepickout(), "01/01/2021");
	}

	@When("^user select the no of adults$")
	public void user_select_the_no_of_adults() throws Throwable {
		dropdown(pom.getSearchHotel().getAdultroom(), "index", "2");
		// dropdown(shp.getAdultroom(), "index", "2");
	}

	@When("^user select the no of childrens$")
	public void user_select_the_no_of_childrens() throws Throwable {
		dropdown(pom.getSearchHotel().getChildroom(), "index", "2");
		// dropdown(shp.getChildroom(), "index", "2");
	}

	@Then("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		click(pom.getSearchHotel().getSubmit());
		// click(shp.getSubmit());

	}

	@When("^User click the select button$")
	public void user_click_the_select_button() throws Throwable {
		click(pom.getSelectHotel().getSelectHotel());
		// click(sh.getSelectHotel());
	}

	@Then("^Click continue button$")
	public void click_continue_button() throws Throwable {
		click(pom.getSelectHotel().getContinueButton());
		// click(sh.getContinueButton());
	}

	@When("^User Enter the first name$")
	public void user_Enter_the_first_name() throws Throwable {
		inputvaluetoElement(pom.getBookHotelPage().getFname(), "Pradeep");
		// inputvaluetoElement(bh.getFname(), "Pradeep");

	}

	@When("^User enter the Last name$")
	public void user_enter_the_Last_name() throws Throwable {
		inputvaluetoElement(pom.getBookHotelPage().getLname(), "Hari");
		// inputvaluetoElement(bh.getLname(), "Hari");

	}

	@When("^User enter the Address$")
	public void user_enter_the_Address() throws Throwable {
		inputvaluetoElement(pom.getBookHotelPage().getAddress(), "Muthapudupet");
		// inputvaluetoElement(bh.getAddress(), "Muthapudupet");
	}

	@When("^User enter the Credit Card no$")
	public void user_enter_the_Credit_Card_no() throws Throwable {
		inputvaluetoElement(pom.getBookHotelPage().getCcnumber(), "1234567890123456");
		// inputvaluetoElement(bh.getCcnumber(), "1234567890123456");
	}

	@When("^User enter the credit card type$")
	public void user_enter_the_credit_card_type() throws Throwable {

		dropdown(pom.getBookHotelPage().getCctype(), "index", "2");
		// dropdown(bh.getCctype(), "index", "2");
	}

	@When("^User enter the expiry date")
	public void user_enter_the_expiry_date_and_select_year() throws Throwable {
		dropdown(pom.getBookHotelPage().getCcexpmonth(), "index", "11");
		// dropdown(bh.getCcexpmonth(), "index", "11");
	}

	@When("^User enter the expiry year$")
	public void user_enter_the_expiry_year() throws Throwable {
		dropdown(pom.getBookHotelPage().getCcexpyear(), "index", "10");
		// dropdown(bh.getCcexpyear(), "index", "10");
	}

	@When("^User enter the CVV number$")
	public void user_enter_the_CVV_number() throws Throwable {
		inputvaluetoElement(pom.getBookHotelPage().getCcnumber(), "109");
		// inputvaluetoElement(bh.getCvvnumber(), "109");
	}

	@Then("^User click the submit button$")
	public void user_click_the_submit_button() throws Throwable {
		click(pom.getBookHotelPage().getBooknow());
		// click(bh.getBooknow());
	}

	@When("^User click to logoutbutton$")
	public void user_click_to_logoutbutton() throws Throwable {
		click(pom.getLogOutPage().getLogout());
		// click(lp.getLogout());
	}

}
