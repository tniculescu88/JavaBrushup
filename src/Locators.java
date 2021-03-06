import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tudor.niculescu/pyTraining/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice ");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		String actual_text = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(actual_text);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul Shetty");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testemail@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("testemail2@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text_with_pwd = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(text_with_pwd);
//		String extracted_pwd = text_with_pwd.strip("Please use temporary password").strip(" to Login.").strip("'");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		

		
//		driver.close();		

	}

}

