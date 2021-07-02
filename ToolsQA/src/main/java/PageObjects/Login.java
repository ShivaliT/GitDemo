package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Learning.ToolsQA.Base;

import org.openqa.selenium.interactions.Actions;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Login extends Base{
	
	
	By C1= By.id("nav-link-accountList-nav-line-1");
	By C2 = By.cssSelector("span[class='nav-action-inner']");
	By C3 = By.xpath("//input[@name='email']");
	
	By C4 =By.xpath("//input[@name='email']");
	By C5= By.id("continue");
	By C6= By.id("auth-fpp-link-bottom");
	
	public Login (WebDriver driver) {
		this.driver=driver;
	}

	
	
	
	public WebElement preSign()
	{
		WebElement PreSignIn= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a =new Actions(driver);
		 a.moveToElement(PreSignIn).perform();
		 return PreSignIn;
	}
	
/*	public  preSign1()
	{
		WebElement PreSignIn= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		/*Actions a =new Actions(driver);
		 a.moveToElement(PreSignIn).perform();
		 return PreSignIn;*/
	//}

//	By C=By.cssSelector("span[class='nav-action-inner']");
	//By d=By.xpath("//input[@name='email']");
	
	
	


/*By C2=	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tak914@gmail.com");


	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("auth-fpp-link-bottom")).click();*/



}

