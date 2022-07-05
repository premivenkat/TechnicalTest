package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusables.UserActions;

public class HolidayTrip {

	public HolidayTrip(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='price-pin_riviera-days-num']")));
		UserActions UA = new UserActions();
		driver.findElement(By.xpath("//span[@id='price-pin_riviera-days-num']")).isDisplayed();
		driver.findElement(By.xpath("//span[@class='heading-md bold pin-price-normal']")).isDisplayed();
		driver.findElement(By.xpath("//a[@id='supplier-phone']")).isDisplayed();
		UA.elementClick(driver, By.xpath("//button[@name='enterbookingflow']"));
	}
	
}
