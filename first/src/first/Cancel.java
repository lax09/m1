package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Cancel {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");;
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");;
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Actions act=new Actions(driver);
		act.moveToElement(leave).build().perform();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		driver.findElement(By.id("leaveList_chkSearchFilter_0")).click();
		driver.findElement(By.id("btnSearch")).click();
		
		String searchdate="2018-06-20";
		
		int rowcount=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		System.out.println(rowcount); 
		
		int irownum=0;
		for (int i=1;i<=rowcount;i++){
			
			String appdate=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			if(searchdate.contains(appdate.trim())){
				
				
				
				
				
				
			}
			
		}
		
		
		
		
		
	}

}
