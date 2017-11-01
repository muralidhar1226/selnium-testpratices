package com.efkon.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args)  {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		
		
		List<WebElement> ls=driver.findElements(By.name("sex"));
		ls.get(0).click();
		
		if(!ls.get(0).isSelected())
		{
			System.out.println("not  selected so selecting male");
			ls.get(0).click();
		}
		else
		{
			System.out.println("Already selected male so selecting female");
			ls.get(1).click();
		}
		
		// challenge 2 select the third radion button
		
		List<WebElement> lsy=driver.findElements(By.name("exp"));
		
		for(int i=0;i<lsy.size();i++)
		{
			String yearsofexpirence=lsy.get(i).getAttribute("Value");
			if(yearsofexpirence.equals("3"))
			{
				System.out.println("matched");
				lsy.get(i).click();
				
				
			
			}
			
		}
		//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection) 
		
		List<WebElement> lsp=driver.findElements(By.name("profession"));
		
		for(int i=0;i<lsp.size();i++)
		{
			String profession=lsp.get(i).getAttribute("Value");
			if(profession.equals("Automation Tester"))
			{
				System.out.println("automation tester is selected");
				lsp.get(i).click();
			}
		}
		
		//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		
		WebElement seleniumide=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		
		seleniumide.click();
		
	}

}
