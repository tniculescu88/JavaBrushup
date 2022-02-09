import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tudor.niculescu/pyTraining/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
//		//staticdropdown with select tag
//		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//		dropdown.selectByIndex(3);
//		dropdown.getFirstSelectedOption().getText();
		
		// dropDown with adults and childs and stuff
		//Select dd2 = new Select(driver.findElement(By.id("divpaxinfo")));
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		for (int i=0; i<7;i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			Thread.sleep(1000);
//		}
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
		

		
		// dynamic drop downs
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@value='MAA']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
//		Thread.sleep(2000);
		

		// auto-sugestive drop down
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(2000);
//		List<WebElement> options = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li a"));
//		
//		for (int i=0;i<options.size();i++)
//		{
//			String opt_text = options.get(i).getText();
//			System.out.println(opt_text);
//			if (opt_text.contentEquals("India"))
//			{
//				System.out.println("Found text!!!");
//				WebElement foundOptionWebElem = options.get(i);
//				foundOptionWebElem.click();
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		
				
		

	}

}
