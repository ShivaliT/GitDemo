package Learning.ToolsQA;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.SearchBox;

public class Successfulsearch extends Base{

	@Test
	public void SuccessSearch() throws IOException, InterruptedException
	{
		loadPropFile();	
		driver = initialiseDriver(browsername);
		Openurl(URL);

		try {
			// Validate dasboard
			Thread.sleep(2000);
			SearchBox searchbox = new SearchBox();
			searchbox.search();
			// the search result is a different page
		
			

		}catch (Exception e) {
			// Logger statement
		}finally {
			closeBrowser();
		}
	}

}
