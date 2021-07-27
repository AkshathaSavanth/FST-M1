package suiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_Activity_5
{
	@Test
	public void getTheMenuBarColor()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		
		String menuColor=driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("color");
		System.out.println("The color of the navigation menu is:"+menuColor);
		 
		driver.close();
		
	}
	
}
