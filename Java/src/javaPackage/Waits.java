package javaPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Implicit wait - sets a global, default timeout for every element lookup in your session.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Toyin");
		System.out.println(driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value"));
		// Fetch Entered Name

		// Explicit Wait - is a targeted approach that pauses execution until an element clickability is met for a particular element.
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("abcd");

		Thread.sleep(3000);
		driver.close();
	}

}
