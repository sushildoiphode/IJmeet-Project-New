
public class SignUpTests {
	@BeforeMethod
	public void launchBrowser()
	{
		Keywords.openBrowser("chrome");
		Constant.driver.get("https://ijmeet.com/register");
		System.out.println("Sign up page  open successfully");
	}

}
