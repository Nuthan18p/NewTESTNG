package com.tcs;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Arithmetic {
	
@Test(groups={"Sanity"})
	public void AddtionMethod1(){
    Assert.assertTrue(true);
		
		int a =1 ;
		int b = 1;
		int c = a+b;
		
		
		System.out.println("Successfully executed Addtion Method-1");
		}
	
	@Test 
	public void MultiplyMethod1(){
    Assert.assertTrue(true);
		
int a =1 ;
		int b = 1;
		int c = a*b;
		
		
		System.out.println("Successfully executed Multiply Method-1");
		}

@Test(groups={"Sanity"})
	public void AddtionMethon2(){
    Assert.assertTrue(true);
		
		int a =1 ;
		int b = 1;
		int c = a+b;
		
		
		System.out.println("Successfully executed Addtion Method-2");
		}
	
	@Test 
	public void MultiplyMethod2(){
    Assert.assertTrue(true);
		
	int a =1 ;
		int b = 1;
		int c = a*b;
		
		
		System.out.println("Successfully executed Multiply Method-2");
		}
	
	@Test 
	public void MultiplyMethod3(){
    Assert.assertTrue(true);
		
	int a =1 ;
		int b = 1;
		int c = a*b;
		
		
		System.out.println("Successfully executed Multiply Method-3");
		}
	
@Test(groups={"Sanity"})
	public void AddtionMethod3(){
    Assert.assertTrue(true);
		
	int a =1 ;
		int b = 1;
		int c = a+b;
		
		
		System.out.println("Successfully executed Addtion Method-3");
		}
}

/*package googleSearch;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GoogleSearch {

	WebDriver driver;
	Logger logger; 
	
	@BeforeTest
	public void launch() {
		
//		  PhantomJS Headless Driver
		
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/projects/challenge/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		  driver = new PhantomJSDriver(caps);
		  System.out.println("PhantomJS Headless Driver launched");
		 
		  logger =Logger.getLogger("GoogleSearch");
		  PropertyConfigurator.configure("Log4j.properties");
	}
	
// 		Write your Data Provider Annotations	
	
	@Test(dataProvider="getData")
	public void googleSearch (String u) {

		driver.get("https://google.com");
		logger.info("Navigated to the URL");
	//	driver.findElement(By.).sendKeys();
	//	driver.findElement(By.).sendKeys();
		logger.info("We have successfully Searched for"+u );
	}

// 	 Write your script inside getdata method with the repected keyword (Fresco Play, Fresco Apps, Ultimatix)
	
@DataProvider
public Object[][] getData(){

Object[][] data = new Object[3][1];
    data[0][0]="Fresco Paly";
		data[1][0]="Fresco Apps";
		data[2][0]="Ultimatix";
		

		
		return data;
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}*/
