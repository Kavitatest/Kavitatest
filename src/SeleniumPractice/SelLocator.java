package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://corporate.spicejet.com/");
		
		//OneWay Trip
		
		//driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).click();

	
	
		
		

	}

}
