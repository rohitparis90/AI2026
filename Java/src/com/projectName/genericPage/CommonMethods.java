package com.projectName.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;



public class CommonMethods extends MasterPage {

	private String webElementKey;

	public CommonMethods() throws Exception {
		super();

	}

	// get the text of WebElement and verify
	public void getTextOfWebElementAndVerify(String WebElementKey, String testData) {
		String actualTextOfWebElement = driver.findElement(By.xpath(pro2.getProperty(WebElementKey))).getText();
		String expectedTextOfWebElement = pro3.getProperty(testData);
		Assert.assertEquals(actualTextOfWebElement, expectedTextOfWebElement );
		System.out.println("Verified Successfully Actual webElement Text: " + actualTextOfWebElement + " || " 
		+ "expected WebElement Text:" + expectedTextOfWebElement);

	}

	// Click web element
	public void clickWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).click();
	
	}

	// Click List of Web Element
	public void clickListOfWebElement(String webElementKey, String testData) {

		List<WebElement> listOfElements = driver.findElements(By.xpath(pro2.getProperty(webElementKey)));
		for (int i = 0; i < listOfElements.size(); i++) {

			if (listOfElements.get(i).getText().equalsIgnoreCase(pro3.getProperty(testData))) {

			}
		}

	}

	// Clear web element
	public void clearWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).clear();
	}

	// Enter data
	public void enterData(String webElemetKey, String testData) {
		driver.findElement(By.xpath(pro2.getProperty(webElemetKey))).sendKeys(pro3.getProperty(testData));

	}

	// mouse hover
	public void moveToElement(String webElementKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(pro2.getProperty(webElementKey)))).build().perform();

	}

	// Select Dropdown value using vasiable Text
	public void selectDropdownValue(String webElementKey, String testData) {
		WebElement ele = driver.findElement(By.xpath(pro2.getProperty(webElementKey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(pro3.getProperty(testData));
	}

	// Read Excel File
	public void readExcelData(String webElementKey, int rowNo, int columnNo, String excelSheetName) throws Exception {
		File src = new File(".\\src\\com\\projectName\\resources\\Excel Test data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(pro1.getProperty(excelSheetName));
		String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).sendKeys(abc);

	}
	// Handle explicit wait - element to be clickable

	public void explicitWait_elementToBeClickacble(String webElementKey) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(pro2.getProperty(webElementKey)))).click();
	}
	// Handle Log File
	public void handleLogger(String LogClassName,String loggerText) {
		Logger logger = Logger.getLogger(LogClassName);
		PropertyConfigurator.configure(pro1.getProperty("log4jPropertiesFileLoc"));
		logger.info(loggerText);
	}
	
	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			// Create ref of TakesScrennshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use the getScreenshotAs
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to specific location in jpg/png format
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + " method() failed, screenshot captured");
		}
}
}
