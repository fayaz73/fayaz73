package com.browserstack;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tcfcuTIGTest extends SeleniumTest {
	
	/*
	@Test
    public void textonScreen() throws Exception {
		String expectedTextOnScreen = "Plant your money here! Watch it grow MORE! 18-month Certificate 4.86% APY ";
        // navigate to bstackdemo
        driver.get("https://www.tcfcu.com/");

        // Check the title
       // Assert.assertTrue(driver.getTitle().matches("Town & Country Federal Credit Union"));
       Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='swiper-pagination-bullet' and @role='button'][3]")).click();
        // Save the text of the banner for later verify
        String TextOnScreen = driver.findElement(By.xpath("//div/h1/p/span[contains(text(),'get burned')]")).getText().toString().trim();
        // verify the text of the banner is the expected one
        Assert.assertEquals(TextOnScreen,expectedTextOnScreen);  
    }
	
	@Test
    public void clickOnButton() throws Exception {
		
        // navigate to testURL
        driver.get("https://www.tcfcu.com/");
        
        //Thread.sleep(1000);
        String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		
		for(WebElement ele: images) {
			
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				ele.click();
				break;
			}
		  continue;
		}

        // click on button
        driver.findElement(By.xpath("//div/h1/p/span[contains(text(),'Plant your money')]/../../../a")).click();
        
        String expectedURL = "https://www.tcfcu.com/membership";

        // See if the page is opened or not
        Assert.assertEquals(driver.getCurrentUrl().toString(),expectedURL);

    }
    */
	
	public void setCampabilities() {
		
		cap = ((RemoteWebDriver) driver).getCapabilities();
        browserName = cap.getBrowserName().toLowerCase();
        os = cap.getPlatformName().toString().toLowerCase();
        browVersion = cap.getBrowserVersion().toLowerCase();
	}
	/*
	@Test
	public void getImageURL() throws Exception {
		
		cap = ((RemoteWebDriver) driver).getCapabilities();
        browserName = cap.getBrowserName().toLowerCase();
        String os = cap.getPlatformName().toString().toLowerCase();
        String browVersion = cap.getBrowserVersion().toLowerCase();
        
		setCampabilities();
		
		driver.get("https://www.tcfcu.com");
		
		//int slideNum=3;
		String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		File SrcFile=null,DestFile;
		//File DestFile;
		int k=0;
		
		for(WebElement ele: images) {
			
			System.out.println(ele.getAttribute("aria-label"));
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				System.out.println(ele.getAttribute("aria-label"));
				ele.click();
				//Call getScreenshotAs method to create image file
				SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				//Move image file to new destination
				DestFile=new File("/home/fayaz/Desktop/BrowserStackImages/"+os+browVersion+browserName+slide.strip()+k+".png");
				//Copy file at destination
				FileUtils.copyFile(SrcFile, DestFile);	
				k++;
				break;
			}
		  continue;
		}
		
		
		
		String imageURL = driver.findElement(By.xpath(("//p/span[contains(text(),\"Pl\")]/../../../../../div"))).getAttribute("style").replaceAll("^\"|\"$", "").replaceAll("\\)|\\;|\"", "");
		
		String expectedImage = "Women-Garden.png";
		
		String a[] = imageURL.split("/");
		
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		String actualImage= a[a.length-1];
		
		Assert.assertEquals(actualImage, expectedImage);
	}
	*/
	/*
	@Test
	public void getTitleFontSize() throws Exception {
		setCampabilities();
		
		// navigate to testURL
        driver.get("https://www.tcfcu.com/");
        
        //Thread.sleep(1000);
        String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		
		for(WebElement ele: images) {
			
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				ele.click();
				break;
			}
		  continue;
		}
		
		String ActualFontSize = driver.findElement(By.xpath("//h1/p/span[contains(text(),'Plant your money')]")).getCssValue("font-size").toString();
		
		String expectedFontSize;
		
		if (os.equals("windows")||os.equals("linux"))
		{
			expectedFontSize = "38px";
		}
		else
		{
			expectedFontSize = "38px";
		}
		
		System.out.println(ActualFontSize);
		Assert.assertEquals(ActualFontSize, expectedFontSize);
		
	}
	*/
	
	/*
	@Test
	public void getTitleFontStyle() throws Exception {
		
		setCampabilities();
		
		// navigate to testURL
        driver.get("https://www.tcfcu.com/");
        
        //Thread.sleep(1000);
        String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		
		for(WebElement ele: images) {
			
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				ele.click();
				break;
			}
		  continue;
		}
		
		String ActualFontStyle = driver.findElement(By.xpath("//h1/p/span[contains(text(),'Plant your money')]")).getCssValue("font-style").toString();
		String expectedFontStyle = "normal";
		System.out.println(ActualFontStyle);
		Assert.assertEquals(ActualFontStyle, expectedFontStyle);
		
	}
	*/
	
	/*
	@Test
	public void getBtnFontSize() throws Exception {
		
		setCampabilities();
		
		// navigate to testURL
        driver.get("https://www.tcfcu.com/");
        
        //Thread.sleep(1000);
        String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		
		for(WebElement ele: images) {
			
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				ele.click();
				break;
			}
		  continue;
		}
		
		String ActualFontSize = driver.findElement(By.xpath("//h1/p/span[contains(text(),'Plant your money')]/../../../a")).getCssValue("font-size").toString();
		
		String expectedFontSize;
		
		if (os.equals("windows"))
		{
			expectedFontSize = "21px";
		}
		else
		{
			expectedFontSize = "14px";
		}
		
		System.out.println(ActualFontSize);
		Assert.assertEquals(ActualFontSize, expectedFontSize);
	
		
	}
	*/
	/*
	@Test
	public void getBtnFontStyle() throws Exception {
		setCampabilities();
		
		// navigate to testURL
        driver.get("https://www.tcfcu.com/");
        
        //Thread.sleep(1000);
        String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		
		for(WebElement ele: images) {
			
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				ele.click();
				break;
			}
		  continue;
		}
		
		String ActualFontStyle = driver.findElement(By.xpath("//h1/p/span[contains(text(),'Plant your money')]/../../../a")).getCssValue("font-style").toString();
		String expectedFontStyle = "normal";
		System.out.println(ActualFontStyle);
		Assert.assertEquals(ActualFontStyle, expectedFontStyle);
	}
	*/
	
	@Test
	public void getTest() {
		setCampabilities();
		driver.get("https://cdn25.lemnisk.co/ssp/smtag/GetJsFileEventCapture.js");
	}
	
	
	/*
	@Test
	public void getBannerSize() throws Exception {
		setCampabilities();
		
		// navigate to testURL
        driver.get("https://www.tcfcu.com/");
        
        //Thread.sleep(1000);
        String slide = "Go to slide 3";
		List<WebElement> images = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet' or @role='button']"));
		
		for(WebElement ele: images) {
			
			if (ele.getAttribute("aria-label").equalsIgnoreCase(slide))
			{
				ele.click();
				break;
			}
		  continue;
		}
		
		String ActualBannerWidth = driver.findElement(By.xpath("//h1/p/span[contains(text(),'Plant your money')]/../../../..")).getCssValue("width").toString();
		String ActualBannerHeight = driver.findElement(By.xpath("//h1/p/span[contains(text(),'Plant your money')]/../../../..")).getCssValue("height").toString();
		
		
		String expectedBannerWidth = "1833px";
		String expectedBannerHeight = "480px";
		
		if (expectedBannerWidth.equalsIgnoreCase(ActualBannerWidth)&&expectedBannerHeight.equals(ActualBannerHeight))
		{
			Assert.assertEquals(true,true);
		}
		else
		{
			Assert.assertEquals(true, false);
		}
	}
	
	*/
	
    

}

		



