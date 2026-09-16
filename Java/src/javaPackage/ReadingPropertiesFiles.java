package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFiles {

	public static void main(String[] args) throws Exception {

		// config properties file
		File src1 = new File("C:\\Users\\bawas\\eclipse-workspace\\Java\\Repository\\config.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// Locators property file
		File src2 = new File("C:\\Users\\bawas\\eclipse-workspace\\Java\\Repository\\locators.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// test data property files
		File src3 = new File("C:\\Users\\bawas\\eclipse-workspace\\Java\\Repository\\testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(pro1.getProperty("URL_1"));

		
		

		// Set the property of chrome browser and pass chromedriver path
		driver.findElement(By.xpath(pro2.getProperty("Name"))).sendKeys(pro3.getProperty("TestData1Name"));
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData2Email"));

		

	}

}
