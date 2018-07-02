package com.qait.jsexecutor.jsexecutortatoc;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;


public class jsCookie {
	JavascriptExecutor js;
	WebDriver driver;

public jsCookie(JavascriptExecutor js)
{
this.js=js;
}

	public void cookieHandle() {
		
		js.executeScript("document.querySelector('a').click();");
		String Token =(String)js.executeScript(" return document.getElementById('token').innerHTML");
		System.out.println(Token+"is here");
		String value = Token.replace("Token: ", "");
		System.out.println(value);
		Cookie ck = new Cookie("Token", value);
		((WebDriver)js).manage().addCookie(ck);
		js.executeScript("document.querySelectorAll('a')[1].click();");
		Assert.assertTrue(((WebDriver)js).findElement(By.className("finish")).getText().equals("End"));
	
}


}
