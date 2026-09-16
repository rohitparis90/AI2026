package com.projectName.pages;

import com.projectName.genericPage.CommonMethods;

public class TestAutomationPracticeLoginPage extends CommonMethods {

	public TestAutomationPracticeLoginPage() throws Exception {
		super();

	}

	// Click on Name Input Box
	public void clickNameInputBox() {
		clickWebElement("Name");
		handleLogger("TestAutomationPracticeLoginPage", "Clicked Name Input Box");
	}

	// Enter Name
	public void enterName() {
		enterData("Name", "testData1Name");
		handleLogger("TestAutomationPracticeLoginPage", "Enter Name");

	}

	// Clear Name Input Box
	public void clearNameInputBox() {
		clearWebElement("Name");
		handleLogger("TestAutomationPracticeLoginPage", "Cleared Name Input Box");
	}

	// Click on Email Input Box
	public void clickEmailInputBox() {
		clickWebElement("Email");
		handleLogger("TestAutomationPracticeLoginPage", "Clicked Email Input Box");
	}

	// Enter Email
	public void enterEmail() {
		enterData("Email", "testData2Email");
		handleLogger("TestAutomationPracticeLoginPage", "Enter Email");

	}

	// Clear Email Input Box
	public void clearEmailInputBox() {
		clearWebElement("Email");
		handleLogger("TestAutomationPracticeLoginPage", "Cleared Email Input Box");
	}

	// get Header text of webElement and verify
	public void getHeaderTextAndVerify() {
		getTextOfWebElementAndVerify("headerText1", "headerTextValue1");
		handleLogger("TestAutomationPracticeLoginPage", "Verified WebElement Text Successfully! ");

	}

	//Click on start Button
	public void clickStartButton() {
		clickWebElement("startButton");
		handleLogger("TestAutomationPracticeLoginPage", "Clicked start Button ");

	} 
	
	//click gender radio button from the list of web elements
	public void clickGender() {
		clickListOfWebElement("genderRadioButtons", "genderRadioButton");
		handleLogger("TestAutomationPracticeLoginPage", "Clicked Gender Radio Button ");
	}
	
	//select country from dropdown
	public void selectCountry() {
		selectDropdownValue("countryDropdown","countryName");
		handleLogger("TestAutomationPracticeLoginPage", "selected India in country dropdown");
		
	}
	
	// mouse Hover to point me 
	public void mouseHoverToPointMeButton() {
		moveToElement("pointMeButton");
		handleLogger("TestAutomationPracticeLoginPage", "Mouse Hover to point me Button ");
		
	}
}
