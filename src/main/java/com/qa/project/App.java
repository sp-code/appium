package com.qa.project;

import javax.activation.URLDataSource;

import java.net.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "18157abf");
        caps.setCapability("appPackage","io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        //String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\project\\Resources\\ApiDemos-debug.apk";
        //String path="test";
       // caps.setCapability(MobileCapabilityType.APP, path);

        URL url = new URL("http://127.0.0.1:4723");

        AppiumDriver driver = new AndroidDriver(url, caps);

        
    }
}
