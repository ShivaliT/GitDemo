package Learning.ToolsQA;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

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

}
