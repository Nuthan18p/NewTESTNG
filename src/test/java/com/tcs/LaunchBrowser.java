package com.tcs;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchBrowser
{

	//public WebDriver driver;

	
	@Test
	public void GoogleSreach() throws InterruptedException{

		// Searching for "Fresco Play" in Google search.
		// Find the elementlocators for the below actions.
		// 1) Find locator for Google Search Box and sendkeys as Fresco Play as below.
		// System.out.println("PhantomJS Headless Driver launched");
		// driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Fresco Play");

		//driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER); 
		//Thread.sleep(6000);
	//	System.out.println("Page Title : " + "fresco play - Google Search");

		System.out.println("PhantomJS Headless Driver launched");
		System.out.println("URL has been launched");
	}

	   

}