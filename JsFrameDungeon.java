package com.qait.jsexecutor.jsexecutortatoc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class JsFrameDungeon {
	JavascriptExecutor jsDriver;
	WebDriver driver;
	String FirstBoxcolor;
	String SecondBoxColor;
	public JsFrameDungeon(JavascriptExecutor jsDriver)
	{
		driver=(WebDriver)jsDriver;
	this.jsDriver=jsDriver;
	}
	
	public void repaintAndProceed()
	{
		driver.switchTo().frame("main");
		String box1 = driver.findElement(By.id("answer")).getAttribute("class");
		 
		 while(true)
		 {
			 jsDriver.executeScript("document.querySelector('body > center > a:nth-child(7)').click();");
			 driver.switchTo().frame("child");
			 String box2 = driver.findElement(By.id("answer")).getAttribute("class");
			 driver.switchTo().parentFrame();
			 if(box1.equals(box2))
			 {
				 jsDriver.executeScript("document.querySelector('body > center > a:nth-child(9)').click();");
				 break;
			 }
		 }	
	
	}}