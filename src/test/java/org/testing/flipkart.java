package org.testing;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class flipkart extends BaseClass{
	
	@BeforeClass
	private void BeforeClass() {
           System.out.println("Before class");
	}
	
	@AfterClass
	private void AfterClass() {
           System.out.println("Before class");
	}
	
	@BeforeMethod
	private void BeforeMethod() {
           System.out.println("Before method");
           BrowserLaunch("chrome");
           urlLaunch("https://www.flipkart.com");
           ImplicitlyWait(15);
	}
	
	@AfterMethod
	private void AfterMethod() {
           System.out.println("after method");
	}
	
	@Test
	private void test() {
           System.out.println("test");
           WebElement cnclbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
           cnclbtn.click();
           WebElement searchbox = driver.findElement(By.name("q"));
           searchbox.sendKeys("Redmi",Keys.ENTER);
//           List<WebElement> allphn = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//           int size = allphn.size();  
//           System.out.println(size);
//           for(int i=0;i<size;i++) {
//        	   WebElement phnname = allphn.get(i);
//        	   String text = phnname.getText();
//        	   System.out.println(text);
//           }
           List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
           int size2 = price.size();
          
           for(int j=0;j<size2;j++) {
        	   WebElement allprice = price.get(j);
        	   String p = allprice.getText();
        	   System.out.println(p);
        	  String s="?12,999";
        	   if(s.contains(",")) {
        		      s = s.replace(",", "");
                        System.out.println(s);
                        List<Integer> price1 =new LinkedList<Integer>();
                        Collections.sort(price1);
                        System.out.println(price1);
                       // System.out.println(price1.get(price1.size()-1));
                        System.out.println(Collections.max(price1));
                        
                        System.out.println("--------------------------");
                        System.out.println(price1.get(0));
                        System.out.println(Collections.min(price1));
        	  }
        	   
        	  
        	   
        	  
        	   
           
           
	}
	
	
	}
}


