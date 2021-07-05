package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Learning.ToolsQA.Base;

public class LoginPage  extends Base {
	By Email= By.xpath("//input[@name='email']");


	By Continue= By.id("continue");
	By Password= By.id("ap_password");
	By FinalSignin= By.id("signInSubmit");
	
	
//	public LoginPage (WebDriver driver) {
//		this.driver=driver;
//	}
//
	
	public  void Login() throws InterruptedException {


		// Click on signin button 
		WebElement mobilenumber = driver.findElement(Email);
		mobilenumber.sendKeys("9730159779");
		
		WebElement cont = driver.findElement(Continue);
		cont.click();
		
		
		WebElement password = driver.findElement(Password);
		password.sendKeys("Inder@125");
		
		WebElement finalsignin = driver.findElement(FinalSignin);
		finalsignin.click();
		
		//return new LoginPage();
	}
	
	
}
