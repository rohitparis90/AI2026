package com.projectName.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.projectName.pages.PageFactoryTestAutomationPracticeLoginPage;

public class PageFactoryTestAutomationPracticeLoginTest extends PageFactoryTestAutomationPracticeLoginPage {

	public PageFactoryTestAutomationPracticeLoginTest() throws Exception {
		super();
	}

	@Test
	public void pageFactoryloginTest() {
		PageFactoryTestAutomationPracticeLoginPage pfc = PageFactory.initElements(driver,
				PageFactoryTestAutomationPracticeLoginPage.class);
		pfc.enterName(pro3.getProperty("testData1Name"));
		pfc.enterEmail(pro3.getProperty("testData2Email"));

	}

}
