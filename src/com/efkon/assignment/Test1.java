package com.efkon.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	
	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		
		String url="http://store.demoqa.com/";
		
		// the below get command will move to website with the help of string url
		driver.get(url);
		
		//get the page titile name and length
		String title=driver.getTitle();
		
		System.out.println("the page title is" +title);
		
		System.out.println(" the title length is  " +title.length());
		
		//get page Url if the current page is loaded or not
		
		String currentpage=driver.getCurrentUrl();
		System.out.println(currentpage);
		
		if(currentpage.equalsIgnoreCase(url))
		{
			System.out.println("its oppened the correct url");
		}
		else
		{
			System.out.println("invalied url");
		}
		
		//get pagesourece and length
		
		String pagesource=driver.getPageSource();
		
		System.out.println("lenght of the pagesource"+pagesource.length());
		
		System.out.println("===========================");
		
		System.out.println(pagesource);
		
		
		
		WebElement element=driver.findElement(By.id("murali"));
		
	
	}

}
