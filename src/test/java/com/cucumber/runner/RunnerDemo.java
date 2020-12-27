package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber/featurefile/adactin.feature",
glue = "com.cucumber.stepdefinitionforpom", 
		plugin = { /* "pretty","html:Report/CucumberReport","json:Report/Cucumber.json", */
		"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentreport.html"},
monochrome = true, dryRun = false, strict = true)

public class RunnerDemo {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() throws Throwable {

		//driver = BaseClass.getBrowser("chrome");
		String browser = FileReaderManager.getInstance().getInstancereader().getbrowser();
		driver = BaseClass.getBrowser(browser);
		System.out.println(browser);
	}
}

/*
 * @AfterClass public static void browserClose() { driver.close(); }
 * 
 * 
 */
