package suiteCRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRM_Activity_1 
{
	@Test
	public void verifyPageTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		String actualPageTitle=driver.getTitle();
		System.out.println(actualPageTitle);
		String expectedPageTitle="SuiteCRM";
		
		Assert.assertEquals(true, actualPageTitle.equalsIgnoreCase(expectedPageTitle));
		driver.close();
		
	}	
}
