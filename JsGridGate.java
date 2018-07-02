package com.qait.jsexecutor.jsexecutortatoc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JsGridGate {
	JavascriptExecutor jsDriver;

	public JsGridGate(JavascriptExecutor jsDriver)
	{
	this.jsDriver=jsDriver;
	}
	
	



	public void clickOnGreen() {
		// TODO Auto-generated method stub
		
//		WebElement element = driver.findElement(By.id("gbqfd"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
				
//		jsDriver.executeScript("document.getElementsByClassName('greenbox')[0].click();");
		jsDriver.executeScript("document.querySelector('div.greenbox').click();");
		String response=(String) jsDriver.executeScript("return document.querySelector(\'div > h1').textContent");
		Assert.assertEquals(response, "Frame Dungeon");
		
	}



}
