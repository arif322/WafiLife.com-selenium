package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import drivers.BaseDrivers;
import drivers.PageDriver;
import pages.HomeBooks;

import utilities.ExtentFactory;

public class AccountCreate2 extends BaseDrivers {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl () {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Go To Author Page</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void AuthorSelect() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Authors Select"
				+ "</b></p>");
		
		HomeBooks homebook = new HomeBooks(childTest);
		homebook.AuthorsSelect();
		
	}
		
		
	
	@Test (priority = 1)
	public void ClickOnSignIn() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Authors Scroll Down & Up</b></p>");
		
		HomeBooks AuthorsName = new HomeBooks(childTest);
		AuthorsName.ViewAuthors();
		AuthorsName.viewAuthors2();
		AuthorsName.viewAuthor3();
		AuthorsName.viewAuthor4();
		AuthorsName.ScrollUpTOAuthor();
		
	}
	
	
	
	@Test (priority = 2)
	public void bookCollect() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Go to next Page</b></p>");
		PageDriver.getCurrentDriver().get(baseUrl);
		HomeBooks GonewPage = new HomeBooks(childTest);
		GonewPage.selectNextPage();
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
	

}
