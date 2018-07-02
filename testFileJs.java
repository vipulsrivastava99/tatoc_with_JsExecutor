package com.qait.jsexecutor.jsexecutortatoc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testFileJs {

	WelcomePage w;
	JsGridGate g; // testng file
	WebDriver driver;
	JsFrameDungeon f;
	dragDropJs d;
	JavascriptExecutor jsDriver;
	jsPopUp j;
	jsCookie c;
	@Test
	public void launchBrowser() {
		driver = new ChromeDriver();
		this.jsDriver = (JavascriptExecutor) driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vipulsrivastava\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://10.0.1.86/tatoc");

	}

	@Test(dependsOnMethods= {"launchBrowser"})
	public void checkBasicCourseLink() {
		w = new WelcomePage((jsDriver));
		w.clickOnBasic();
	}

	@Test(dependsOnMethods= {"checkBasicCourseLink"})
	public void checkGridGate() {
		g = new JsGridGate(jsDriver);
		g.clickOnGreen();
	}

	@Test(dependsOnMethods= {"checkGridGate"})
	public void checkRepaintAndProceed() {
		f = new JsFrameDungeon(jsDriver);
		f.repaintAndProceed();
	}
	
	@Test(dependsOnMethods= {"checkRepaintAndProceed"})
	public void checkdragBox() {
		d= new dragDropJs(jsDriver);
		d.dragBox();
	}	
	@Test(dependsOnMethods= {"checkdragBox"})
	public void checkpopup() throws InterruptedException {
		j= new jsPopUp(jsDriver);
		j.popUp();
		}
		
	@Test(dependsOnMethods= {"checkpopup"})
		public void checkCookie() throws InterruptedException {
			c= new jsCookie(jsDriver);
			c.cookieHandle();
	}
}
