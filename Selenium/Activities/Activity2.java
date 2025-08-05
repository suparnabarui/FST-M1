package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Page title is :"+ driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		String message = driver.findElement(By.cssSelector("h1.text-emerald-500")).getText();
		System.out.println("Login success message : "+ message );
		
		driver.quit();
		

	}

}
