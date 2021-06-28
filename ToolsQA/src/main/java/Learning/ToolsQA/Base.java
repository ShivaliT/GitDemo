package Learning.ToolsQA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {


		System.out.println(System.getProperty("user.dir"));
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("/Users/VSBist/eclipse-workspace/ToolsQA/data.properties");

		prop.load(fis);
		//prop.getProperty("URL");
		String URL = prop.getProperty("URL");
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);	


		if(browsername.equals("chrome"))
		{

			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"));
			driver = new ChromeDriver();

			driver.navigate().to(URL);  
			System.out.println (driver.getTitle());
			driver.getCurrentUrl();
		}
		else {
			System.out.println("No browser");
		}
		//driver=new ChromeDriver();
		WebElement PreSignIn= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a =new Actions(driver);

		a.moveToElement(PreSignIn).perform();

		driver.findElement(By.cssSelector("span[class='nav-action-inner']")).click();


		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tak914@gmail.com");


		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("auth-fpp-link-bottom")).click();


	}

}
