package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_const
{
	public WebDriver driver;
	static
	{
		System.setProperty(gecko_key, gecko_value);
	}
	@BeforeMethod
	public void openAppln()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}
	
	@AfterMethod
	public void closeAppln()
	{
		//driver.quit();
	}
}
