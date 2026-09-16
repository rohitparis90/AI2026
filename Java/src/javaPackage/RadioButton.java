package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	// Dynamic method creating to click on any text
	public static void selectRadioButton(WebDriver driver, String webElementText) {
		driver.findElement(By.xpath("//*[text()='" + webElementText + "']")).click();
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://designsystem.digital.gov/components/radio-buttons/");

		// driver.get("https://materializecss.com/radio-buttons.html");

		// 1st Way - Not Recommended
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Booker T. Washington']")).click();
		// System.out.println(driver.findElement(By.xpath("//label[text()='Booker T.
		// Washington']")).getText());

		// Standard Practice - Recommended
		Thread.sleep(2000);
		selectRadioButton(driver, "Frederick Douglass");

		// selectRadioButton(driver, "Green");

		Thread.sleep(3000);
		driver.close();
	}

}

///	 Set the property of ChromeDriver and pass chrome driver path
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
