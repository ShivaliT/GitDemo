package Learning.ToolsQA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;
	public static String browsername;
	public static String URL;
	
	
	
	public void loadPropFile() throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("/Users/VSBist/eclipse-workspace/GitStuff/GitDemo/ToolsQA/data.properties");

		prop.load(fis);

		URL = prop.getProperty("URL");
		browsername = prop.getProperty("browser");
		System.out.println(browsername);
	}

	public WebDriver initialiseDriver(String browsername) throws IOException {

		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else {
			System.out.println("No browser");
		}
		//driver=new ChromeDriver();
		//	return driver;

		return driver;

	}

	 public void Openurl(String myURL) {
		// TODO Auto-generated method stub
		driver.navigate().to(myURL);  
		System.out.println (driver.getTitle());
			
	}
	 
	 
	 public void closeBrowser() {
		 driver.quit();
	 }
	 
	 public void performMouseHover(By e)
	 {
		 Actions a = new Actions(driver);
		 a.moveToElement(driver.findElement(e)).perform();
	 }

}
