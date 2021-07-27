package suiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_Activity_2 
{
	@Test
	public void verifyPageTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		String URL=driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img")).getAttribute("src");
		System.out.println("URL of the image is :"+URL);
		driver.close();
		
	}	
}
