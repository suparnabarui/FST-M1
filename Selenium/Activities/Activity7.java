package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://training-support.net/webelements/dynamic-controls";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//Get the title of the page and print it to the console.
		System.out.println("The page title is :"+ driver.getTitle());
		/*		 
		Check if the text field is enabled and print it.
		Click the "Enable Input" button to enable the input field.
		Check if the text field is enabled again and print it.
		Close the browser.
		*/
		
		WebElement textfield = driver.findElement(By.id("textInput"));
		System.out.println("The text field is enabled :"+textfield.isEnabled());
		driver.findElement(By.id("textInputButton")).click();
		System.out.println("The text field is enabled :"+textfield.isEnabled());
		
		driver.quit();
		
		
		
	}

}
