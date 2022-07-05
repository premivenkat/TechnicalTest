package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.BookOnline;
import com.pages.HolidayTrip;
import com.pages.HomePage;
import com.pages.PassengerDetails;
import com.pages.Search;

public class MultiBrowser {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@Parameters("browser")
	@BeforeSuite
	
	public void setUp(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resources//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,20);
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,20);
		}
	}
	
	@Test (priority=1)
	public void ApplicationHomePage() throws InterruptedException {
		@SuppressWarnings("unused")
		HomePage home = new HomePage(driver, wait);
	}
	
	@Test (priority=2)
	public void search() {
		@SuppressWarnings("unused")
		Search sear = new Search(driver, wait);
	}
	
	@Test (priority=3)
	public void holidayTrip() {
		@SuppressWarnings("unused")
		HolidayTrip trip = new HolidayTrip(driver, wait);
	}
	
	@Test (priority=4)
	public void bookOnline() {
		@SuppressWarnings("unused")
		BookOnline online = new BookOnline(driver, wait);
	}
	
	@Test (priority=5)
	public void passengerDetails() throws InterruptedException {
		@SuppressWarnings("unused")
		PassengerDetails pass = new PassengerDetails(driver, wait);
	}
	
	@AfterSuite
	public void end() {
		driver.quit();
	}
	
}