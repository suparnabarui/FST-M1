package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	
	 WebDriver driver;
	
	@BeforeClass	
	public void beforeMethod() {
        driver = new FirefoxDriver();        
        driver.get("https://training-support.net");
    }
	
	@Test(priority = 1)
	public void testCase1() {		
		System.out.println("Page title is: "+ driver.getTitle());
		// Assert page title
		Assert.assertEquals(driver.getTitle(), "Training Support");
		WebElement aboutUsButton = driver.findElement(By.linkText("About Us"));
		
		//Test will only continue, if the below statement is true
		//This is to check whether the link is displayed or not
		Assert.assertTrue(aboutUsButton.isDisplayed());
		// Find and click the About page link
		aboutUsButton.click();
		
	}
	@Test(priority = 2)
    public void aboutPageTest() {
        // Assert page title
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
	
	@AfterClass
	public void closeup() {
		driver.quit();
	}

}
