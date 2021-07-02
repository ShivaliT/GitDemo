package Learning.ToolsQA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class PreLogin extends Base {


	@Test	
	public void validateTitle() throws IOException
	{
		try {
			System.out.println(System.getProperty("user.dir"));
			Properties prop = new Properties();

			FileInputStream fis = new FileInputStream("/Users/VSBist/eclipse-workspace/GitStuff/GitDemo/ToolsQA/data.properties");

			prop.load(fis);

			String URL = prop.getProperty("URL");
			String browsername = prop.getProperty("browser");
			System.out.println(browsername);	

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

}
