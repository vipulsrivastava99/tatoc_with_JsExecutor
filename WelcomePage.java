package com.qait.jsexecutor.jsexecutortatoc;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import junit.framework.Assert;

public class WelcomePage {
	JavascriptExecutor jsDriver;

	public WelcomePage(JavascriptExecutor jsDriver) {
		this.jsDriver = jsDriver;
	}

	
	public void clickOnBasic() {
		jsDriver.executeScript("document.querySelector('a').click();");
		String response = (String) jsDriver.executeScript("return document.querySelector(\'div > h1').textContent");
		Assert.assertEquals(response, "Grid Gate");

	}
}
