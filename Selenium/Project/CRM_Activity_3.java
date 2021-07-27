package suiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_Activity_3
{
	@Test
	public void getCopyRightText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		String copyRight=driver.findElement(By.id("admin_options")).getText();
		System.out.println("The copyright text is:"+copyRight);
		driver.close();
	}

}
