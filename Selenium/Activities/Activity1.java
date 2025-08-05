package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net");
		System.out.println("Page title is : "+ driver.getTitle());
		//driver.findElement(By.xpath("//a[text()='About Us']")).click();
		//driver.findElement(By.cssSelector("a.card")).click();
		driver.findElement(By.linkText("About Us")).click();		
		//WebElement linkp=driver.findElement(By.linkText("About Us"));
		//linkp.click();
		System.out.println("New Page title is :"+ driver.getTitle());
		driver.quit();


	}

}
