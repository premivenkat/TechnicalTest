package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyPayment {
	
	public VerifyPayment(WebDriver driver, WebDriverWait wait) {
		WebElement m=driver.findElement(By.xpath("//div[@class='nbf_tpl_pms_buttonarea']//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", m);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nbf_product_pricingsummary']")));
		driver.findElement(By.xpath("//div[@id='nbf_product_pricingsummary']")).isDisplayed();
	}

}
