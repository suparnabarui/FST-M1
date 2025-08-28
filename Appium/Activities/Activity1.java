package activities;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        
        UiAutomator2Options options = new UiAutomator2Options();
	    options.setPlatformName("android");
	    options.setAutomationName("UiAutomator2");
	    options.setApp("C:/Users/002UEV744/Desktop/Study/FST/APPIUM/Calculator.apk");
	    options.noReset();
	    
        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }

    // Test method
    @Test
    public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("digit_6")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("result_final")).getText();

        // Assertion
        Assert.assertEquals(result, "30");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}