package SeleniumPractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		String expe="You're getting an auto quote today!";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.geico.com/");
		driver.findElement(By.xpath("(//div[@class='product-checkbox'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Start My Quote']")).click();
		
		String actualtext=driver.findElement(By.xpath("(//h2[@class='modal-headline'])[1]")).getText();
		
		//assert.assertEquals(actualtext, expe);
		
		driver.findElement(By.cssSelector("input[id='bundle-modal-zip']")).sendKeys("560089");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.id("Id_GiveInitialZipCode_67734")).sendKeys("560089");
		
		
		
		


	}

}
