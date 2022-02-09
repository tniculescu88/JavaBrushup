import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Tudor";
		System.setProperty("webdriver.chrome.driver", "/Users/tudor.niculescu/pyTraining/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String pwd = get_password(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice ");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String actual_text = driver.findElement(By.tagName("p")).getText();
		System.out.println(actual_text);
		Assert.assertEquals(actual_text, "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		
	}
	
	
	public static String get_password(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice ");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text_with_pwd = driver.findElement(By.cssSelector("form p")).getText();
		String return_pwd = text_with_pwd.split("'")[1].split("'")[0];
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		return return_pwd;
		
	}

}
