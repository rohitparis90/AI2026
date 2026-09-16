package com.projectName.pages;

import com.projectName.genericPage.CommonMethods;

public class AmazonSearchPage extends CommonMethods{

	public AmazonSearchPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	//click on amazon search box
	public void clickAmazonSearchBox() {
		clickWebElement("amazonSearchBox");
		handleLogger("AmazonSearchPage","Clicked amazon Search Box");
		
	}
	//Enter Laptop
	public void enterLaptop() {
		enterData("amazonSearchBox","laptop1");
		handleLogger("AmazonSearchPage","Enter Laptop Details");
		
	}

}
