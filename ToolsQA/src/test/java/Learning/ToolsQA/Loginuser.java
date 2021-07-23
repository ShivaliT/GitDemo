package Learning.ToolsQA;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;

public class Loginuser extends Base{

	@Test
	public void SuccessSign () throws IOException, InterruptedException
	{
		loadPropFile();	
		driver = initialiseDriver(browsername);
		Openurl(URL);
		HomePage homePage =new HomePage(driver);
		
		try {
			homePage.performMouseHoverOverAccountLabel();
			
		}catch (Exception e) {
			// Logger statement
		}
		
	
		try {
			// click on signin button
			LoginPage loginPage =  homePage.clickSignIn();
			
			loginPage.Login();
			
			// Validate dasboard
			
		}catch (Exception e) {
			// Logger statement
		}finally {
			closeBrowser();
		}


	}

		
		
	}

