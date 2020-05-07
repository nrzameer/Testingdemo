package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SamplePOM {
	private WebDriver driver; 
	
	public SamplePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void getTtile() {
		System.out.println(driver.getPageSource());
	}
}
