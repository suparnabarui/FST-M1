package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Page title is :"+ driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.quit();

	}

}
