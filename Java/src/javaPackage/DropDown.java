package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1st way
		Thread.sleep(2000);
		driver.findElement(By.id("country")).sendKeys("India"); // send key to enter India

		// 2nd Way
		List<WebElement> country = driver.findElements(By.xpath("//select[@id='country']/option"));
		System.out.println("Total Dropdown Values 1st: " + country.size());
		country.get(1).click(); // Canada
		Thread.sleep(2000);
		country.get(8).click(); // Brazil

		// 3rd Way
		WebElement bm = driver.findElement(By.xpath("//select[@id='country']"));// Single selectable drop down
		Select countryDropdown = new Select(bm);
		Thread.sleep(2000);
		countryDropdown.selectByVisibleText("Australia"); // Australia
		Thread.sleep(2000);
		countryDropdown.selectByValue("japan"); // Japan
		Thread.sleep(2000);
		countryDropdown.selectByIndex(3); // Germany
		System.out.println(countryDropdown.getFirstSelectedOption().getText()); // Germany - Current Selected value

		// 4th Way
		List<WebElement> dropdown = countryDropdown.getOptions();
		System.out.println("Total Dropdown Values 2nd: " + dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("China")) {
				dropdown.get(i).click();

			}
		}

	}

}

/*
 * 
 * That Select object (countryDropdown) gives you convenient methods like:
 * 
 * selectByVisibleText("Australia")
 * selectByValue("japan")
 *selectByIndex(3)
 * getFirstSelectedOption()
 * 
 */
