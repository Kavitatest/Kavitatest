package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testup {

	/*
	 * WebDriver driver;
	 * 
	 * @Test public void verifyingLogin() throws InterruptedException {
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * driver.manage().window().maximize(); driver.get("https://www.amazon.in/");
	 * 
	 * 
	 * driver.findElement(By.xpath("")).sendKeys("");
	 * driver.findElement(By.xpath("")).sendKeys("");
	 * driver.findElement(By.xpath("")).click();
	 * 
	 * Assert.assertEquals(actual,expected);
	 * 
	 * 
	 * 
	 * WebElement
	 * ep=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	 * 
	 * Actions ab=new Actions(driver);
	 * ab.moveToElement(ep).click().build().perform(); Thread.sleep(300);
	 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
	 * "test12@gmail.com");
	 * driver.findElement(By.cssSelector("input[type='submit']")).click();
	 * 
	 * }
	 */
	
public static void main(String args[])
{
	
	int i,j,input=5;
	
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
	}
	
	//System.out.println();
}
}
