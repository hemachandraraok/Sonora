package com.usmanhussain.sonora.examples.cucumber.webdriver.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.inject.Provider;

public class WebDriverProvider implements Provider<WebDriver> {

	public WebDriver get() {
		return new FirefoxDriver();

	}

}
