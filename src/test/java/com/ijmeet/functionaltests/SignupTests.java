package com.ijmeet.functionaltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.ijmeet.keywords.FEKeywords;
import com.ijmeet.keywords.Keywords;
import com.ijmeet.pages.SignUpPage;
import com.ijmeet.util.Constant;
import com.ijmeet.util.FileUtil;
import com.ijmeet.util.TestBase;




public class SignupTests extends TestBase{
	//ElementNotFoundexception exception=new ElementNotFoundexception();
	String SignUpurl="https://ijmeet.com/register";
	@BeforeMethod
	public void openSignUppage() throws InterruptedException
	{
		Thread.sleep(1000);
		Constant.driver.findElement(By.xpath("//a[@href=\"https://ijmeet.com/register\"]")).click();
		
	
	}
    @Ignore
	@Test
	public void openSignUp_page()
	{
		String acturl=SignUpurl;
		String expurl="https://ijmeet.com/register";
		Assert.assertTrue(acturl.contains(expurl));
	}
	@Ignore
	@Test
	public void SignUp_logo()
	{
		FEKeywords.getWebElement("Xpath",FileUtil.getProperty("signuplogo"));
	    SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		Assert.assertTrue(SignUp.SignUplogo_isDisplayed(),"Signup logo is displayed");
	}
	@Ignore
	@Test
	public void FullNameisDisplayed()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		Assert.assertTrue(SignUp.FullName_isDisplayed());
	}
	@Ignore
	@Test
	public void ComapnyNameisDisplayed()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		Assert.assertTrue(SignUp.CompanyName_isDisplayed());
    }
	@Ignore
	@Test
	public void EmailIdisDisplayed()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		Assert.assertTrue(SignUp.EmailId_isDisplayed());
	}
	@Ignore
	@Test
	public void MobileNumisDisplayed()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		Assert.assertTrue(SignUp.Mobilenum_isDisplayed());
	}
	@Ignore
	@Test
	public void PasswordisDisplayed()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		/*
		 * try { throw new ElementNotFoundexception(); } catch (ElementNotFoundexception
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		
		Assert.assertTrue(SignUp.Password_isDisplayed());
	}
	@Ignore
	@Test
	public void textinCompany_input()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		SignUp.CompanyNameText();
	}
	@Ignore
	@Test
	public void enterCompanyNamelabel() throws InterruptedException
	{
		FEKeywords.getWebElement("CSS",FileUtil.getProperty("FullName")).sendKeys("Pratham");//enter fullname
		
		//enter email id
		FEKeywords.getWebElement("CSS",FileUtil.getProperty("email")).sendKeys("Radhika@10gmail.com");
	    FEKeywords.getWebElement("CSS",FileUtil.getProperty("mobno")).sendKeys("986554720");
	    Thread.sleep(1000);
	    FEKeywords.getWebElement("CSS", FileUtil.getProperty("password")).sendKeys("Testing@20");
	    Thread.sleep(1000);
	   WebElement captchaele=FEKeywords.getWebElement("Xpath",FileUtil.getProperty("iframeSignup") );
	    Constant.driver.switchTo().frame(captchaele);
	    Thread.sleep(2000);
	   WebElement captcha=FEKeywords.getWebElement("Xpath",FileUtil.getProperty("captcha"));
	    captcha.click();
	    Thread.sleep(1000);
	    String url=Constant.driver.getWindowHandle();
	    Constant.driver.switchTo().window(url);
	    FEKeywords.getWebElement("Xpath", FileUtil.getProperty("Signupbutton")).click();
	    
	  
	  }
	@Ignore
	@Test
	public void EmailIdplaceholder()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		Assert.assertTrue(SignUp.emailIdplaceholder_isDisplayed());
	}
	@Ignore
	@Test
	public void entermailId()
	{
		SignUpPage SignUp=PageFactory.initElements(Constant.driver,SignUpPage.class);
		SignUp.enterTextinmailId();
	}
	@Ignore
	@Test
	public void  verifylenthemailtextbox()
	{
		WebElement SignUp=FEKeywords.getWebElement("CSS", FileUtil.getProperty("textinsidemailidtextbox"));
		SignUp.sendKeys("sgsdgdfhdhfj");
	}
	@Test
	
	
}
