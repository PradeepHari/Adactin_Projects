package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\MR.PRADEEP\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\MR.PRADEEP\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid BrowserName");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputvaluetoElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropdown(WebElement element, String option, String value) {
		Select ss = new Select(element);

		if (option.equals("index")) {
			int parseInt = Integer.parseInt(value);
			ss.selectByIndex(parseInt);
		} else if (option.equals("value")) {
			ss.selectByValue(value);

		} else if (option.equals("text")) {
			ss.selectByVisibleText(value);
		}

	}

	public static void close(String close) {

		try {
			driver.get(close);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exit(String exit) {

		try {
			driver.get(exit);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateTo(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitImplicit() {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitExplicit(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void explicitWait(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fluentWait() {
		try {
			Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
					.ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void acceptAlert() {
		try {
			Alert salert = driver.switchTo().alert();
			salert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dismissAlert() {
		try {
			Alert dalert = driver.switchTo().alert();
			dalert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void action(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(Element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Frames(WebElement Element, String option, String value) {
		if (option.equalsIgnoreCase("value")) {
			driver.switchTo().frame(Element);
		} else if (option.equalsIgnoreCase("Element")) {
			driver.switchTo().frame(Element);
		} else if (option.equalsIgnoreCase("Index")) {
			driver.switchTo().frame(Integer.parseInt(value));

		}

	}

	public static void ScrollUpAndDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

	public static void TakesScreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desfile = new File(System.getProperty("user.dir") + "\\Screenshot\\" + filename + ".png");
		FileUtils.copyFile(srcFile, desfile);
	}

	public static void jsSendKeys(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','pradeep@gamil.com')", element);

	}

}
