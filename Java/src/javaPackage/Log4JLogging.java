package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4JLogging {

	public static void main(String[] args) {
		// Create a logger instance and configure log4j.properties file
				Logger logger = Logger.getLogger("Log4JLogging");
				PropertyConfigurator.configure("C:\\Users\\bawas\\eclipse-workspace\\Java\\Repository\\log4j.properties");

				// Open Browser Instance
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				logger.info("Open Browser Instance");

				// Maximize the window
				driver.manage().window().maximize();
				logger.info("Window Maximized");

				// Implicit Wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				logger.info("Implicit Wait Given");

				// Open Application
				driver.get("https://testautomationpractice.blogspot.com/");
				logger.info("Application Opened");

				// Check If the web element is displayed or not
				try {
					driver.findElement(By.id("wrong_confirmBtn")).isDisplayed();
					logger.info("Confirm Button displayed");
				} catch (Exception e) {
					logger.info("Error - Confirm Button not displayed");
				}

			}

		}
