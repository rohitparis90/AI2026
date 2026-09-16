package javaPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");

		WebElement wb = driver.findElement(By.xpath("//*[@id=\"_r_3_\"]/div"));


		// Check enabled status of the day drop down
		boolean Enabledstatus = wb.isEnabled();
		System.out.println(Enabledstatus);

		// Check display status of day drop down
		boolean DisplayStatus = wb.isDisplayed();
		System.out.println(DisplayStatus);

		// Select value from drop down
		Select sel = new Select(wb);
		sel.selectByIndex(3);

		// Count all values from drop down
		List<WebElement> ls = sel.getOptions();
		System.out.println(ls.size());

		// Month drop down
		WebElement wb1 = driver.findElement(By.id("day"));
		Select sel1 = new Select(wb1);
		sel.selectByVisibleText("July");

		Thread.sleep(3000);

		// Year drop down
		WebElement wb2 = driver.findElement(By.id("day"));
		Select sel2 = new Select(wb2);
		
		sel.deselectByValue("2000");

	}

}
