package Learning.ToolsQA;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import PageObjects.HomePage;
import PageObjects.LoginPage;



public class PreLogin extends Base {


	@Test	
	public void validateTitle() throws IOException
	{
		try {
			//System.out.println(System.getProperty("user.dir"));
			loadPropFile();	
			driver = initialiseDriver(browsername);
			Openurl(URL);

			System.out.println (driver.getTitle());
			System.out.println (driver.getCurrentUrl());
		}catch (Exception e) {
			// TODO: handle exception
			// Logger stament ("Issue with accessing Property files")
		}finally {
			closeBrowser();
		}	
	}
	
	
	@Test
	public void IsSignInButtonClicable() throws InterruptedException, IOException {
		loadPropFile();	
		driver = initialiseDriver(browsername);
		Openurl(URL);
		
		try {
			HomePage l =new HomePage(driver);
			
			l.performMouseHoverOverAccountLabel();
			l.clickSignIn();
		}catch (Exception e) {
			// Logger statement
		}finally {
			closeBrowser();
		}
	}

	@Test 
	public void VerifyLoginUsingValidCredentials() throws IOException, InterruptedException {
		// launch browser
		// URL
		// Hover over Account
		// Click on signin
		loadPropFile();	
		driver = initialiseDriver(browsername);
		Openurl(URL);
		HomePage l =new HomePage(driver);
		
		try {
			l.performMouseHoverOverAccountLabel();
			
		}catch (Exception e) {
			// Logger statement
		}

	
		try {
			// Validate dasboard
			
		}catch (Exception e) {
			// Logger statement
		}finally {
			closeBrowser();
		}


	}

}
