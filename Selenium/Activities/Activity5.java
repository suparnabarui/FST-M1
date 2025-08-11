package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://training-support.net/webelements/dynamic-controls";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//Get the title of the page and print it to the console.
		System.out.println("The page title is:"+driver.getTitle());
		
		//Find the checkbox input element.

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        // Find the toggle button and click it
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the button again
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        
        /*
		if(driver.findElement(By.id("checkbox")).isDisplayed()) {
			driver.findElement(By.xpath("//*[text()='Toggle Checkbox']")).click();
			if(driver.findElement(By.id("checkbox")).isDisplayed()) {
				System.out.println("checkbox is still visible");
			}else {
				System.out.println("checkbox is not visible");
			}
		} */
		driver.quit();
	}

}
