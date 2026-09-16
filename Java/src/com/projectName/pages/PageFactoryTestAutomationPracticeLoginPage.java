package com.projectName.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.projectName.genericPage.CommonMethods;

public class PageFactoryTestAutomationPracticeLoginPage extends CommonMethods{

	public PageFactoryTestAutomationPracticeLoginPage() throws Exception {
		super();
		
	}

	@FindBy(xpath = "//input[@id='name']")
	WebElement name;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	public void enterName(String testData) {
		name.sendKeys(testData);

	}

	public void enterEmail(String testData) {
		email.sendKeys(testData);

	}
}
