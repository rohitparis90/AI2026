package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {
	
	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("D:\\20Apr2026 Sel+Playwright\\seleniumPlay.xlsx");

		// Load the file
		FileInputStream fis = new FileInputStream(src);

		try (// Load the work book
		XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			// Load Work Sheet
			XSSFSheet sh = wb.getSheet("Sheet1");

			// Print the loaded sheet name
			System.out.println(sh.getSheetName());

			// Print merged cell from Excel sheet
			System.out.println(sh.getRow(0).getCell(0).getStringCellValue()); //Java

			// Print Selenium from Excel Sheet
			System.out.println(sh.getRow(1).getCell(1).getStringCellValue());//Introduction to Automation Testing (Selenium)

			// Print Java from Excel Sheet
			System.out.println(sh.getRow(1).getCell(0).getStringCellValue());//Introduction to Java

			// Print float/double value from excel sheet
			//System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());

			// Print int value from excel sheet
			//System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());

			// print total number of rows
			//System.out.println("Total Rows: " + sh.getPhysicalNumberOfRows());

			// print total number of columns
			//System.out.println("Total Columns: " + sh.getRow(2).getLastCellNum());

			// Real Time Implementation
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bawas\\eclipse-workspace\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://testautomationpractice.blogspot.com/");
			String s = sh.getRow(1).getCell(1).getStringCellValue();
			driver.findElement(By.id("name")).sendKeys(s);
		}

	}

}
