package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Base_Test;
import pom.MainPage;

public class MHSignIn extends Base_Test
{
	@Test
	public void testclickSignIn()
	{
		MainPage mp=new MainPage(driver);
		mp.helloMouseHover();
	}



}
