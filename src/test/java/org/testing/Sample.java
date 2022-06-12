package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Sample extends BaseClass {
	@BeforeClass
	private void BeforeClass() {
		System.out.println("Before Class");
		

	}
	@AfterClass
	private void AfterClass() {
		System.out.println("after Class");

	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Before  method");
		BrowserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		ImplicitlyWait(12);
		
}
	@AfterMethod
	private void AfterMethod() {
		System.out.println("after method ");
	
	}
	
	
	@Test
	private void Test1() throws AWTException, InterruptedException {
		System.out.println("test");
		Robot r=new Robot();
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclick.click();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("iphone");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> phnname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<String>li =new LinkedList<String>();
				int size = phnname.size();
		for(int i=0;i<size;i++) {
			WebElement allphn = phnname.get(i);
			String text = allphn.getText();
			System.out.println(text);
			List<WebElement> phnprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			int s = phnprice.size();		
			System.out.println(s);
			for(int j=0;j<s;j++) {
				WebElement allprice = phnprice.get(j);
				String text2 = allprice.getText();
				System.out.println(text2);
				if(text2.contains("$")) {
					text2.replace("$", "");	
				}
				if(text2.contains(",")) {
					text2.replace(",", "");
				}
				li.add(text2);
			}
			 Collections.sort(li);
			 System.out.println(li);
				
					for(int k=0;k<s;k++) {
						String s1 = li.get(k);
						System.out.println(s1);
						
					}	
					}
		
				
	}	
			
			
		}

	


