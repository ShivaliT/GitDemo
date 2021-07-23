package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
import Learning.ToolsQA.Base;



public class HomePage extends Base{


	By AccountLabel = By.id("nav-link-accountList-nav-line-1");
	By Signin = By.cssSelector("span[class='nav-action-inner']");
	
   By selection = By.xpath("//*[@id=\"searchDropdownBox\"]/option");
    
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
	public void performSelection() throws InterruptedException {


		// Click on signin button 
	
			// Create object of the Select class
		//	 Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
			//Select select= new Select(driver.findElement(By.id("searchDropdownBox")));
			List<WebElement> AllSelectElements = driver.findElements(selection);
						System.out.print("hi");
						// List per element , get text and print the value.
						for(int i=0; i < AllSelectElements.size() ; i++) {
							System.out.println(AllSelectElements.get(i).getText());
							
						}
		
	}
	
	public void findSize() throws InterruptedException {	
		List<WebElement> AllSelectElementscount = driver.findElements(selection);
			if(AllSelectElementscount.size()>42)
			{
				System.out.println(" Elements are more than 42");
				
			}
		
			else 
			{
				System.out.println(" Elements are less than 42");
			}
			Thread.sleep(3000);
		}
		
		
	
	//	return new LoginPage();
	}
	





