package com.projectName.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {

	public static WebDriver driver;
	public Properties pro1;
	public Properties pro2;
	public Properties pro3;

	public MasterPage() throws Exception {
		// config properties file implementation
		FileInputStream fis1 = new FileInputStream(".\\src\\com\\projectName\\repository\\config.properties");
		pro1 = new Properties();
		pro1.load(fis1);

		// Locators properties file implementation
		FileInputStream fis2 = new FileInputStream(".\\src\\com\\projectName\\repository\\locators.properties");
		pro2 = new Properties();
		pro2.load(fis2);

		// Test data properties file implementation
		FileInputStream fis3 = new FileInputStream(".\\src\\com\\projectName\\repository\\testdata.properties");
		pro3 = new Properties();
		pro3.load(fis3);

		// launching Browsers -chrome/edge
		if (pro1.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath") + "chromedriver.exe");
			driver = new ChromeDriver();

		} else if (pro1.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty(pro1.getProperty("driverProperty"),
					pro1.getProperty("driverPath") + "firefoxdriver.exe");
			driver = new FirefoxDriver();

		} else if (pro1.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath") + "edgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("No Browser instance found");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL_1"));
	}
}