package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusables.UserActions;

public class Search {
	
	WebDriverWait wait;
	WebDriver driver;
	
	public Search(WebDriver driver, WebDriverWait wait) {
		UserActions UA = new UserActions();
		UA.textFieldEntry(driver, By.xpath("//div[@id='freetext_search_form']//input[@class='nbf_tpl_quicksearch_searchtext']"), "india");
		UA.elementClick(driver, By.xpath("//div[@id='freetext_search_form']//button[@class='nbf_button nbf_tpl_quicksearch_button']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='India']")));
		UA.elementClick(driver, By.xpath("//span[text()='India']/parent::div/following-sibling::div//button[text()='More info']"));
	}

}
