package first;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HrmLogin {

	public static void main(String[] args) {

		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.com/hrm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.quit();
		
		
		
		
	}

}
