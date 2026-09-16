package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");

		// accept alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		// dismiss alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		System.out.println("Alert Handled Successfully!");
	}

}
