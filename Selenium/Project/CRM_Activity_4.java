package suiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_Activity_4
{
	@Test
	public void loginToCRM()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		
		String actualHomePageURL=driver.getCurrentUrl();
		String expectedHomePageURL="https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
		
		if(expectedHomePageURL.equals(actualHomePageURL))
		{
		System.out.println("Home page opened successfully");
		}
		
		driver.close();
	}
}
