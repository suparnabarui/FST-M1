package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String url = " https://training-support.net/webelements/dynamic-controls";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//Get the title of the page and print it to the console
		System.out.println("The page title is: "+ driver.getTitle());
		
		
		WebElement checkBoxItem = driver.findElement(By.id("checkbox"));		
		System.out.println("the checkbox is selected:"+ checkBoxItem.isSelected());
		checkBoxItem.click();
		System.out.println("the checkbox is selected:"+ checkBoxItem.isSelected());
		
		
		driver.quit();
	}

}
