package appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class ApiTestMain 
{
	 public static void main(String[] args) throws MalformedURLException {
	        // Set the desired capabilities for the Android driver
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName", "Galaxy M12");
	        capabilities.setCapability("app", "/home/tvisha/Downloads.apk"); // Replace with the path to your APK file
	        
	        // Create the Appium driver for Android
	        AppiumDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	        // Your automation code goes here
	        // For example, perform assertions to verify that the app is launched successfully

	        // Close the driver session
	        driver.quit();
	    }
	}


