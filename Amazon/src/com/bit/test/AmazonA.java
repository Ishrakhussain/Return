package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonA {
FirefoxDriver dr;
public void openbrowser() {
	System.setProperty("webdriver.gecko.driver", 
	"C:\\\\Users\\\\Ishra\\\\Downloads\\\\geckodriver-v0.27.0-win64\\\\geckodriver.exe");
dr= new FirefoxDriver();
}
public void closebrowser() {
	dr.quit();
}
public void gotoanywebsite(String url) {
	dr.get(url);
}
public void clickonanyelement(By locator) {
	dr.findElement(locator).click();
	}
public void typeonanyelement (By locator, String Value) {
	dr.findElement(locator).sendKeys(Value);
}


}
