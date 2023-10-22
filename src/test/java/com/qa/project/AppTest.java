package com.qa.project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    AppiumDriver driver;
    
   @Test
    public void beforeClass() throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "18157abf");
        caps.setCapability("appPackage","com.testbook.tbapp");
        caps.setCapability("appActivity", "com.testbook.tbapp.android.router.RouterActivity");
        String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\project\\Resources\\app-beta-release-7.16.5.1-19-Oct-23-05.37-PM.apk";
        //String path="test";
        caps.setCapability(MobileCapabilityType.APP, path);

        URL url = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(url, caps);

        // String deepUrl = "testbook://tbapp/settings";

        // HashMap<String,String> map=new HashMap<String,String>();

        // map.put("url", deepUrl);
        // map.put("package","com.testbook.tbapp");

        // driver.executeScript("mobile:deepLink", map);


    }

  /*   @AfterClass
    public void afterClass()
    {
        driver.quit();
    } */
}
