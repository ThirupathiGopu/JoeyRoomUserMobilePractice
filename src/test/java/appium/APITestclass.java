package appium;

import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class APITestclass 
{
	 private AppiumDriver driver;
	 DesiredCapabilities capabilities;

	    @BeforeTest
	     
	    public void setup() throws MalformedURLException
	    {
	        capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName", "Galaxy M12");
	        capabilities.setCapability("app", "/home/tvisha/Downloads.apk");
	        capabilities.setCapability("UdID", "RZ8T404LY3P");
//
//	        if (platformName.equalsIgnoreCase("Android")) {
//	            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	        } else if (platformName.equalsIgnoreCase("iOS")) {
//	            driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	        }
	       driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        
	    }

	    @Test
	    public void launchAppTest() throws IOException 
	    {
	    	
	    }

	    @AfterTest
	    public void tearDown() {
	         {
	            driver.quit();
	        }
	    }
}
