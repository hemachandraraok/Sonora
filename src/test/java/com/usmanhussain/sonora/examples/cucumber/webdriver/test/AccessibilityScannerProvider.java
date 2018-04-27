package com.usmanhussain.sonora.examples.cucumber.webdriver.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.usmanhussain.sonora.AccessibilityScanner;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class AccessibilityScannerProvider implements
		Provider<AccessibilityScanner> {
	private WebDriver driver;

	@Inject
	public AccessibilityScannerProvider(WebDriver driver) {
		this.driver = driver;
	}

	public AccessibilityScanner get() {
		try {
			return new AccessibilityScanner(driver);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
