package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusables.UserActions;

public class BookOnline {
	
	public BookOnline(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='nbf_button nbf_tpl_pms_book_button']")));
		UserActions UA = new UserActions();
		UA.elementClick(driver, By.xpath("//button[@class='nbf_button nbf_tpl_pms_book_button']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Double ']/parent::div/parent::div[@class='nbf_tpl_pms_bf_room nbf_grid nbf_grid--pad']//select[@class='nbf_tpl_pms_roomselection_js']")));
		Select drproom = new Select(driver.findElement(By.xpath("//div[text()='Double ']/parent::div/parent::div[@class='nbf_tpl_pms_bf_room nbf_grid nbf_grid--pad']//select[@class='nbf_tpl_pms_roomselection_js']")));
		drproom.selectByVisibleText("1");
		UA.elementClick(driver, By.xpath("//button[@class='nbf_button nbf_tpl_pms_book_button']"));
	}

}
