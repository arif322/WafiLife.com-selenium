package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import drivers.BaseDrivers;
import drivers.PageDriver;
import pages.AuthorBooks;

import utilities.ExtentFactory;

public class AccountCreate3 extends BaseDrivers {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl () {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Cat select</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void Selectpage() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  life Related Books"
				+ "</b></p>");
		
		AuthorBooks bookSelect = new AuthorBooks(childTest);
		bookSelect.BookClick();
//		
		}
	
	@Test (priority = 1)
	public void SelectCat() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>View Selected Book Details"
				+ "</b></p>");
		
		AuthorBooks catSelect = new AuthorBooks(childTest);
		catSelect.viewAnyBookDetails();
		}
		
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
	

}
