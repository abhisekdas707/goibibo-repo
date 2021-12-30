package com.goibibo.testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.goibibo.generic.BaseClass;
import com.goibibo.pom.HotelsPage;
public class Home extends BaseClass {

	@Test
	public void homepage() throws IOException, AWTException
	{

		driver.get("https://www.goibibo.com/hotels/"); //Enter the url
		HotelsPage h1=new HotelsPage(); //create an object of HotelsPage POM class
		PageFactory.initElements(driver, h1); // initialize the element
		Reporter.log(h1.setdata(),true); // print the statement

	}

}
 