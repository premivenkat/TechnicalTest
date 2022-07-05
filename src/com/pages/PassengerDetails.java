package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusables.UserActions;

public class PassengerDetails {
	
	public PassengerDetails(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='pax-a-title-1']")));
		UserActions UA = new UserActions();
		Select title1 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-title-1']")));
		title1.selectByVisibleText("Mrs");
		UA.textFieldEntry(driver, By.xpath("//input[@name='pax-a-first-1']"), "FirstTestOne");
		UA.textFieldEntry(driver, By.xpath("//input[@name='pax-a-last-1']"), "LastTestOne");
		Select Date1 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-dobd-1']")));
		Date1.selectByVisibleText("4");
		Select Month1 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-dobm-1']")));
		Month1.selectByVisibleText("April");
		Select year1 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-doby-1']")));
		year1.selectByVisibleText("1999");
		Select title2 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-title-2']")));
		title2.selectByVisibleText("Mrs");
		UA.textFieldEntry(driver, By.xpath("//input[@name='pax-a-first-2']"), "FirstTestTwo");
		UA.textFieldEntry(driver, By.xpath("//input[@name='pax-a-last-2']"), "LastTestTwo");
		Select Date2 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-dobd-2']")));
		Date2.selectByVisibleText("4");
		Select Month2 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-dobm-2']")));
		Month2.selectByVisibleText("April");
		Select year2 = new Select(driver.findElement(By.xpath("//select[@name='pax-a-doby-2']")));
		year2.selectByVisibleText("1995");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-name']"), "DummyUsersTest last");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-mobile']"), "0741542254");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-email']"), "dummy@gmail.com");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-address1']"), "test");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-address2']"), "teststreet");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-city']"), "Hyderabad");
		UA.textFieldEntry(driver, By.xpath("//input[@name='contact-postcode']"), "5080051");
		Select country = new Select(driver.findElement(By.xpath("//select[@name='contact-country']")));
		country.selectByVisibleText("India");
		Select heard = new Select(driver.findElement(By.xpath("//select[@name='wheredidyouhear']")));
		heard.selectByVisibleText("Email");
		Thread.sleep(10000);
	}

}
