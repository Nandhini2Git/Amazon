package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.MainPage;

public class ClickSignIn extends Base_Test 
{
	@Test
	public void testClickSignIn()
	{
		MainPage mp= new MainPage(driver);
		mp.signInClick();
	}
}
