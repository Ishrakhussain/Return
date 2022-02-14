package com.bit.test;

import org.openqa.selenium.By;

public class Amazon{

public static void main(String[] args) {
	AmazonA s= new AmazonA();
	s.openbrowser();
	s.gotoanywebsite("https://www.amazon.com/");
	s.clickonanyelement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
	s.clickonanyelement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
	s.typeonanyelement(By.xpath("//input[@type='email']"), "9294996638");
}

}
