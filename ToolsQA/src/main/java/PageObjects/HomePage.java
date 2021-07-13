package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
import Learning.ToolsQA.Base;



public class HomePage extends Base{


	By AccountLabel = By.id("nav-link-accountList-nav-line-1");
	By Signin = By.cssSelector("span[class='nav-action-inner']");
	

	public HomePage (WebDriver driver) {
		this.driver=driver;
	}

	public void performMouseHoverOverAccountLabel() throws InterruptedException {
		// Check if accountLabel is visible and clickable ??
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.elementToBeClickable(AccountLabel));

		// Hover over it
		performMouseHover(AccountLabel);
		Thread.sleep(2000);
	}

	public LoginPage clickSignIn() throws InterruptedException {


		// Click on signin button 
		WebElement signInButton = driver.findElement(Signin);
		signInButton.click();
		return new LoginPage();
	//	return new LoginPage();
	}
	
	


}



