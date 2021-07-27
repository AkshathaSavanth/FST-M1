package suiteCRM;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_Activity_6 
{
	@Test
	public void menuChecking()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		
		
		List<WebElement> menuList1 =driver.findElements(By.xpath("//*[@id=\"toolbar\"]/ul/li/span/a"));
		System.out.println(menuList1.size());
		
		for(WebElement a:menuList1)
		{
			if(a.getText().equalsIgnoreCase("Activities"))
			{
				a.click();
				System.out.println("Element is present and is clickable");
			}
		}
		
	}
}
