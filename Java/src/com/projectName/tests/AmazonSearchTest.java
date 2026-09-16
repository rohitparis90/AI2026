package com.projectName.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.projectName.pages.AmazonSearchPage;

public class AmazonSearchTest extends AmazonSearchPage {

	public AmazonSearchTest() throws Exception {
		super();
	}

	//AmazonSearchTest ast = new AmazonSearchTest();

	@Test
	void amazonsearchSenarioE2E() throws Exception {
		clickAmazonSearchBox();
	enterLaptop();

	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		captureScreenshot(result2);
	}
}
