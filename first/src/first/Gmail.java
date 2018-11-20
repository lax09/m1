package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/");
		driver.findElement(By.className("gmail-nav__nav-link gmail-nav__nav-link__sign-in")).click();
		
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.MILLISECONDS);
		
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("09prasannak");
		driver.findElement(By.id("identifierId")).sendKeys("09prasannak");
		driver.findElement(By.id("yDmH0d"));
		driver.findElement(By.name("password")).sendKeys("Amma@489");	
		driver.findElement(By.className("RveJvd snByac")).click();
		
		
	}

}
