package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String url = "https://training-support.net/webelements/mouse-events";
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	
	driver.get(url);
	driver.manage().window().maximize();
	//Get the title of the page and print it to the console.
	System.out.println("The page title is :"+ driver.getTitle());
	/*
	
Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it.
 Print the confirmation text at the end of the sequence.
Double click on the src button. 
Then right click on the target button and select open. 
Print the confirmation text at the end of the sequence.
	 */
	
	
	// Find the elements that can be clicked
    WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
    WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
    WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
    WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));

	action
	.click(cargoLock)
	.pause(1000)
	.moveToElement(cargoToml)
	.pause(1000)
	.click(cargoToml).build().perform();
	
	// Print the front side text
    String actionMessage = driver.findElement(By.id("result")).getText();
    System.out.println(actionMessage);
	
	action
	.doubleClick(srcButton)
	.pause(1000)
	.pause(1000)
	.contextClick(targetButton)
	.pause(3000).build().perform();
	
	action.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(5000).build().perform();
    // Print the front side text
    actionMessage = driver.findElement(By.id("result")).getText();
    System.out.println(actionMessage);
    
	driver.quit();
	}

}
