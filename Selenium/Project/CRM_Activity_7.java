package suiteCRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_Activity_7 
{
@Test
public void readingAPopup()
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://alchemy.hguy.co/crm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	driver.findElement(By.id("bigbutton")).click();
	
	driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
	List<WebElement> salesList=driver.findElements(By.xpath("//*[@id=\"toolbar\"]/ul/li[2]/span[2]/ul/li/a"));
	
	for(WebElement b:salesList)
	{
		if(b.getText().equalsIgnoreCase("Leads"))
		{
			b.click();
			System.out.println("Clicked on Leads");
		}
	}
	driver.findElement(By.xpath("//*[@id=\"adspan_205c59f2-f260-7cd7-bfc8-5f0b1c18c985\"]/span")).click();
	System.out.println(driver.findElement(By.xpath("//*[@class='phone']")).getText());
	
}
}
