package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws Exception {

		// Set the property of ChromeDriver and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");

		// Launch the chrome driver instance
		WebDriver driver = new ChromeDriver();

		// Open the url using get() method
		driver.get("https://www.landrover.in/defender/defender-110/index.html");

		// Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();

		// Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();

		// open another url using get() method
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");

		// Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();

		// Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();

		// Fetch the current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

		// Fetch the title of the page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		// Close the browser
		Thread.sleep(2000);
		driver.close();
	}

}





/*
 * WebDriver Direct Methods:-
 
 * 1. get() - open url 
 * 2. getCurrentUrl() - return current url 
 * 3. getTitle() -
 * return page title 
 * 4. findElement() - identify single web element 
 * 5.findElements() - identify multiple web elements 
 * 6. close() - close the current page 
 * 7. quit() - close the entire browser instance 
 * 8.getWindowHandle() - will handle single window 
 * 9. getWindowHandles() - will
 * handle multiple windows 
 * 10. switchTo() - use to switch to another window,
 * frame, etc. 
 * 11. navigate() - used to navigate back, forward, etc. 
 * 12.manage() - used to perform maximize the window
 
 * Web Element Operational Methods:-
 
 * 1. click(); 
 * 2. sendKeys() 
 * 3. clear() 
 * 4. getText() 
 * 5. getTagname() 
 * 6. isSelected() 
 * 7. isDisplayed() 
 * 8. isEnabled() 
 * 9. getAttribute()
 * 
 */
