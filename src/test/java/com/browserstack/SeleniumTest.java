package com.browserstack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest {
    public WebDriver driver;
    MutableCapabilities capabilities = new MutableCapabilities();
    Capabilities cap;
    String os,browVersion,browserName;
    String username;
    String accessKey;
    String buildName;
    
    HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
    
    

    @BeforeMethod(alwaysRun = true)
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //driver = new ChromeDriver(options);
        
        //=============================================================================================
        username = System.getenv("BROWSERSTACK_USERNAME");
        accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        buildName = System.getenv("JENKINS_LABEL");
        
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "100.0");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "Windows");
        browserstackOptions.put("osVersion", "10");
        browserstackOptions.put("sessionName", "BStack Build Name: " + buildName);
        browserstackOptions.put("seleniumVersion", "4.0.0");
        capabilities.setCapability("bstack:options", browserstackOptions);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.browserstack.com/wd/hub"), capabilities);
        
        //=========================================================================================================
        /*
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "103.0");
        browserstackOptions.put("platformName", "Windows");
        browserstackOptions.put("osVersion", "11");
        capabilities.setCapability("bstack:options", browserstackOptions);
        
        capabilities.setCapability("browserName", "Firefox");
        capabilities.setCapability("browserVersion", "102.0");
        browserstackOptions.put("platformName", "Windows");
        browserstackOptions.put("osVersion", "10");
        capabilities.setCapability("bstack:options", browserstackOptions);
        
        browserstackOptions.put("osVersion", "13");
        browserstackOptions.put("deviceName", "Samsung Galaxy S23 Ultra");
        browserstackOptions.put("realMobile", "true");
        capabilities.setCapability("bstack:options", browserstackOptions);
        */
       // cap = ((RemoteWebDriver) driver).getCapabilities();
       // browserName = cap.getBrowserName().toLowerCase();
    
        
        //caps = ((RemoteWebDriver) driver).getCapabilities();
        
        
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
