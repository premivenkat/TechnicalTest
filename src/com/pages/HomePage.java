package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		driver.get("https://www.mailtravel.co.uk/");
		String title = driver.getTitle();
		Assert.assertEquals("Home Page | Mail Travel", title);
		Thread.sleep(10000);
		By cookies_accept = By.xpath("//button[@id='onetrust-accept-btn-handler']");
		wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
	}

}
