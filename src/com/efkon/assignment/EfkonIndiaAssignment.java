package com.efkon.assignment;
/*code written by muralidhar
 * 
 */

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;




public class EfkonIndiaAssignment {

	WebDriver driver;
	String firstletter;


	@Test
	public  void skypeTask() throws InterruptedException {

		 driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


		//1) open https://www.skype.com/en
		driver.get("https://www.skype.com/en/");

		// which is for deleting cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);

		//System.out.println("1) opened https://www.skype.com/en");
		
		
		//2)click on Download skype button

		donwnloadSkype("C:\\Opening SkypeSetup.exe");

		//5) click on start conversation
		driver.findElement(By.xpath(".//a[@id='guestHostButtonTop']")).click();
		//System.out.println("5) clciked on start converation");

		//6) verify start conversation button is disabled 
		conversationbutton();
		
		
		//7)Type first character of your usename considering your name is stored in a variable. so take 1st character of it only
		//8)click start conversation button
		enterstring1stname("muralidhar1226");
		
		//9) verify "Loading..." text
		verifyingloading();
		
		//10)get sucessfull login
		succesfulllogin();
		
		//11) verify join.skype.com is a part of https://join.skype.com/xxxxx(you will find this just after login in invite anyone to chat ith this link
		verifyingjoinskype();
		
		//12)verify tool tip for emoticons and sendphotos and files in right section
		tooltipemoticons();
		
		//13) click share conversion and verify "invite via link" and its logo
		shareconversation();

		
		//14)click send photos and files and select  file to share 15) verifying the filename from conversation pan is in sendingphotos method
		sendingphotos( "C:\\Users\\U0153217\\Desktop\\New Text Document.txt", "C:\\Opening Fileupload.exe");

		//16)17) print file size and time format
		filesizeandtimeformat();
		
		//18)click signup from left pan
		signuplink();
	}


	/**
	 * Method used to download skype
	 * @throws InterruptedException
	 */
	public void donwnloadSkype(String path) throws InterruptedException{
		driver.findElement(By.className("downloadBtnWrapper")).click();
		//System.out.println("2) Clicked on download skype button");

		driver.findElement(By.xpath(".//a[@class='btn primaryCta ']")).click();
		//System.out.println("3) clciked on get skype for windows button");

		try {

			Process process = new ProcessBuilder(path).start();
			Thread.sleep(15000);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		//System.out.println("3) Go back");
		Thread.sleep(5000);
		driver.navigate().back();
		//System.out.println("3) Go back");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
	/**
	 * method used to verify start conversation button is disabled or not
	 */

	public void conversationbutton()
	{

		WebElement startconversation=driver.findElement(By.xpath(".//a[@id='guestHostSubmitButton']"));
		//when button got disabled aria-diabled = true
		//<a id="guestHostSubmitButton" class="btn primaryCta disabled" role="button" title="Start a conversation" tabindex="0" aria-hidden="false" aria-disabled="true" aria-label="Start a conversation" data-tracking-type="click" data-position="hero" data-campaign-id="guest_host_su
		String attribute=startconversation.getAttribute("aria-disabled");
		
		Assert.assertEquals("true", attribute);
		//System.out.println("6) submit button is in disable mode which will returns true===  "+attribute);
	}


	/** 
	 * method is used to for entring string name and click on start conversation button
	 * @param yourname
	 * @throws InterruptedException
	 */
	public void enterstring1stname(String yourname) throws InterruptedException 
	{
		//7)Type first character of your usename considering your name is stored in a variable. so take 1st character of it only


		WebElement enteryourname=driver.findElement(By.xpath(".//input[@class='formField lgHiddenDown']"));

		enteryourname.clear();
		firstletter=yourname.substring(0,1);


		enteryourname.sendKeys(firstletter);
		Thread.sleep(3000);
		WebElement startconversation1=driver.findElement(By.xpath(".//a[@id='guestHostSubmitButton']"));
		//when button got enabled aria-diabled = false
		//<a id="guestHostSubmitButton" class="btn primaryCta" role="button" title="Start a conversation" tabindex="0" aria-hidden="false" aria-disabled="false" aria-label="Start a conversation" data-tracking-type="click" data-position="hero" data-campaign-id="guest_host_submit">
		String attribute1=startconversation1.getAttribute("aria-disabled");
		//System.out.println("Submit conversation button is enabled mode which ill retirn false==="+attribute1);
		Assert.assertEquals("false", attribute1);
		//System.out.println("7) Typed first character of username "+firstletter+"  which is present in varaible");
		
		//8)click start conversation button
		startconversation1.click();
		//System.out.println("8) clicked on start conversation button");
		Thread.sleep(5000);
		String url1=driver.getCurrentUrl();
		boolean flag=url1.contains("guest");

		Assert.assertTrue(flag, "verified url containing guest");

	}



	/**
	 * method is used for verify the loading text apperas or not
	 * @throws InterruptedException
	 */

	public void verifyingloading() throws InterruptedException
	{

		//9 verify the "Loading..." text
		WebElement element=driver.findElement(By.xpath(".//div[@class='shellSplashLoading']"));
		String text=element.getText();

		Assert.assertEquals("Loading...", text, " Verified that text contains loading...");
		//System.out.println("9)Verified that text contains loading...");

	}

	/**
	 *  this method will do succesfull login
	 * @throws InterruptedException
	 */
	public void succesfulllogin() throws InterruptedException
	{

		//10)get succesfull login

		if(driver.findElements(By.id("welcomeMessage")).size()!=0)
		{

			String geusnmae=driver.findElement(By.xpath(".//div[@id='welcomeMessage']")).getAttribute("innerHTML");
			//System.out.println(geusnmae);
			/*String firstletter="m";
			String text="Hi m, share this link";
			int m=text.indexOf(firstletter, 0);
			System.out.println(text.substring(text.indexOf(firstletter, 0), text.indexOf(firstletter, 0)+1));*/
			String projectedtext=geusnmae.substring(geusnmae.indexOf(firstletter, 0), geusnmae.indexOf(firstletter, 0)+1);
			Assert.assertEquals(projectedtext, firstletter, "Succesfull login both the names are correct" );
			
			//System.out.println("10) =========Succes full login====");
			Thread.sleep(10000);

			WebElement cpylink=driver.findElement(By.xpath(".//*[@id='copyLinkBtn']/span"));
			Actions copylink=new Actions(driver);
			copylink.moveToElement(cpylink).click().perform();

			Thread.sleep(5000);

		}




	}

	/**
	 * method is used for verifying jpinskype.com is present or not
	 */
	public void verifyingjoinskype()
	{
		//11)verify join.skype.com is a part of https://join.skype.com/xxxxx(you will find this just after login in invite anyone to chat ith this link

		WebElement joinskype=driver.findElement(By.xpath(".//input[@id='joinLinkInputSecondScreen']"));

		System.out.println(joinskype.getAttribute("value"));

		if(joinskype.getAttribute("value").contains("join.skype.com"))
		{
			System.out.println("11)join.skype.com is a part of ---" +joinskype.getAttribute("value"));
			
		}
		else
		{
			System.out.println("join.skype.com is not a part of ----" +joinskype.getAttribute("value"));
			
		}

	}
	
	/**
	 * method is used for verifying tooltip of emoticons, send photos and files
	 * @throws InterruptedException
	 */
	public void tooltipemoticons() throws InterruptedException
	{
		//12) verify tool tip for emotins and sendphotos and files in right section

		WebElement tooltipforemoticons=driver.findElement(By.xpath(".//button[@class='btn swx-expression-picker-btn transparent circle emoticon-picker-button large']"));

		String expectedemoticon="Emoticons";

		String actualtooltip=tooltipforemoticons.getAttribute("title");

		Assert.assertEquals(expectedemoticon, actualtooltip, "tool tip of emoticons is verified");
		
		WebElement tooltipforphots=driver.findElement(By.xpath(".//div[@class='swx-file-picker-btn filePicker']/label"));

		String expectedphotos="Send Photos and Files";

		String actualtooltip1=tooltipforphots.getAttribute("title");

		Assert.assertEquals(expectedphotos, actualtooltip1, "tool tip of send photos and files is verified");
		
		//System.out.println("12) tooltip of emotions and send photo and files is verified");
	}


	/**
	 * method is used for share conversations
	 */
	public void shareconversation()
	{

		//13) click on share conversation and verify invite via link and its logo
		WebElement ele1=driver.findElement(By.xpath(".//button[@class='btn shareButton circle classicShare']/span"));
		ele1.click();
		//System.out.println("13) clicked on share conversation");
		

	}

	/**
	 * the method is used for sending phots and checking
	 * @param filelocationpath
	 * @param fileuploadexepath
	 * @throws InterruptedException
	 */

	public  void sendingphotos( String filelocationpath, String fileuploadexepath) throws InterruptedException
	{
		WebElement tooltipforphots=driver.findElement(By.xpath(".//div[@class='swx-file-picker-btn filePicker']/label"));
		Actions sendphotaction=new Actions(driver);

		sendphotaction.moveToElement(tooltipforphots).click().perform();
		
		String getfilenamefrompath=filelocationpath.substring(filelocationpath.lastIndexOf("\\")+1);
		

		try {

			Process process = new ProcessBuilder(fileuploadexepath,filelocationpath).start();
			Thread.sleep(10000);
			//System.out.println("file uploaded" );
			Thread.sleep(5000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("14)clicked on send photos and files ans selected file to share");

		WebElement sendingphoto=driver.findElement(By.xpath(".//div[contains(@id,'msg_')]/p/span[@class='filename']"));

		System.out.println(" uploaded file name is "+sendingphoto.getText());
		Assert.assertEquals(getfilenamefrompath, sendingphoto.getText(), "verified the filename in conversation pan");
		
		//System.out.println("15) verified the filename in conversation pan");

	}

	/**
	 * this method will prints the filesize and time format
	 */
	public void filesizeandtimeformat()
	{



		//16)print the file size and 17) print time format filesize
		WebElement elementfilesize=driver.findElement(By.xpath(".//div[contains(@id,'msg_')]/p/span[@class='filesize']"));
		System.out.println("16) printed the file size "+elementfilesize.getText());
		WebElement elementtimeformat=driver.findElement(By.xpath(".//p[contains(@id,'time_')]"));
		System.out.println("17) printed the Time format is "+elementtimeformat.getAttribute("title"));


	}

	/**
	 * this method will click the signuplink
	 */
	public void signuplink()
	{
		//18) click on sign up from left pan

		driver.findElement(By.xpath(".//a[@id='createAccountButton']/span")).click();
		//System.out.println("18) clicked on signup link from left pan");
	}

}

