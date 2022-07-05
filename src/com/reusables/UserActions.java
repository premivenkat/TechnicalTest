package com.reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserActions {
	
	public void textFieldEntry(WebDriver driver, By by, String data) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(data);
	}
	
	public void elementClick(WebDriver driver, By by) {
		driver.findElement(by).click();
	}

}
