package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.BaseClass;
import org.testng.annotations.*;

public class Amazon extends BaseClass{
	@BeforeClass
	private void BeforeClass() {
		System.out.println("BeforeClass");

	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Before Method");
		BrowserLaunch("chrome");
		urlLaunch("https://www.amazon.com/");
		ImplicitlyWait(15);
       
	}
	@AfterClass
	private void AfterClass() throws InterruptedException {
   System.out.println("AfterClass");
   Thread.sleep(5000);
   //quit();
	}
	@AfterMethod
	private void AfterMethod() {
		System.out.println("After method");
		System.out.println("ok ok");
	}
	@Test
	private void Test() throws AWTException {
		System.out.println("Test");
		sendKeys(driver.findElement(By.xpath("//input[@type='text']")), "IPhone");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	     List<WebElement> name = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	     int size = name.size();
	     for(int i=0;i<size;i++) {
	    	 WebElement s = name.get(i);
	    	// System.out.println(s);
	    	 String text = s.getText();
	    	 System.out.println(text);
	    	 
	     }
		
	}

}
