package PageObjects;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Learning.ToolsQA.Base;
public class SearchBox extends Base{


	By searchTextBox= By.id("twotabsearchtextbox");

	By goButton = By.id("nav-search-submit-button");
//By Resultsa1 = By.xpath("//div[contains(@class,'s-result-item')]");
//By Resultsa2 = By.xpath("//div[contains(@class,'-main-slot s-result-list s-search-results sg-row')]");
By Resultsa = By.xpath("//div[contains(@data-asin,'B0')]");
	//By Results = By.xpath("//body/div[@id='a-page']/div[@id='search']/span[1]/div[1]/span[1]/h1[1]/div[1]/div[1]/div[1]/div[1]");



	public void search() throws InterruptedException {

		Thread.sleep(2000);
		// Click on signin button 
		WebElement search = driver.findElement(searchTextBox);
		search.sendKeys("Apple phones");
		Thread.sleep(2000);
		WebElement go =driver.findElement(goButton);
		go.click();
		System.out.println("hi");
	}
	//	Thread.sleep(5000);
//	}

	public void searchcount()  throws InterruptedException {


		List<WebElement> items =driver.findElements(Resultsa);
	int counter=	items.size();
	System.out.println(counter);
		
		for( WebElement product : items){
		//	System.out.println(product.get[i]);
			product.getText();
			
		         
			System.out.println(product.getText());


		}

	}

}






//return new LoginPage();




