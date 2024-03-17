package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");



		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement elementtext=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		wait.until(ExpectedConditions.visibilityOf(elementtext)).click();


		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));

		Actions ab=new Actions(driver);
		ab.moveToElement(element).click().sendKeys("Apple mobiles",Keys.ARROW_DOWN,Keys.ENTER).build().perform();

		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[15]")).click();
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[16]")).click();
		driver.findElement(By.xpath("//span[text()='COMPARE']")).click();


	}

	

}
