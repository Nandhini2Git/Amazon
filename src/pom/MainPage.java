package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class MainPage extends Base_Page
{
	//Find Elements
	
	@FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[2]")
	private WebElement hello;
	
	@FindBy(xpath="//span[.='Sign in']")
	private WebElement mhSignIn;
	
	@FindBy(xpath="(//span[.='Sign in'])[2]")
	private WebElement signIn;
	
	
	public MainPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void helloMouseHover()
	{
		mouseHover(hello);
	}

	public void signInClick()
	{
		signIn.click();
	}
}
