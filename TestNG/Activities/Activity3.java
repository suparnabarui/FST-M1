package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		 driver = new ChromeDriver();
		 driver.get("https://training-support.net/webelements/login-form/");
	}
	
	
	@Test
	public void Testcase1() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);
    }
	

	
	@AfterClass
	public void closeup() {
		driver.quit();
	}
}
