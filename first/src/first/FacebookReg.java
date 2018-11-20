package first;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class FacebookReg {

	public static void main(String[] args) {

		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Lax");
		driver.findElement(By.name("lastname")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("laxmi09@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("laxmi09@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Lax@489");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("13");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1992");
		
	driver.findElement(By.id("u_0_a")).click();
	driver.findElement(By.name("websubmit")).click();
		
		
	}

}
