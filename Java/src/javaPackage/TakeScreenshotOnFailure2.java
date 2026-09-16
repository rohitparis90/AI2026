package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
	//	t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://testautomationpractice.blogspot.com/");
		t1.driver.findElement(By.id("wrong_name")).sendKeys("Alex");
	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}

}
