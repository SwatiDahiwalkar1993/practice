package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommanUtils.PropertyFileUtil;
import CommanUtils.WebDriverUtil;

public class OrganizationsTest {
	@Test 
	public void OrganizationTest() throws IOException, InterruptedException
	{
	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	WebDriver driver = new ChromeDriver();

		// To read data from property file
		String URL = putil.getDataFromPropertyFile("URL");
		String USERNAME = putil.getDataFromPropertyFile("USERNAME");
		String  PASSWORD= putil.getDataFromPropertyFile("PASSWORD");
		
		//To launch the web application
		driver.get(URL);
		//To Maximize the window
				wutil.maximize(driver);
				//To apply wait to findlElement()
				wutil.implicitwait(driver);
		
		//To read data from Excel file
		// String ORGNAME = eutil.getDataFromExcel("Orgnizations", 0, 1);
	    // String GROUP = eutil.getDataFromExcel("Organizations", 1, 1);
		 
	     driver.get(URL);

	    driver.findElement(By.name("user_name")).sendKeys(USERNAME);	
	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("submitButton")).click();
}
}
