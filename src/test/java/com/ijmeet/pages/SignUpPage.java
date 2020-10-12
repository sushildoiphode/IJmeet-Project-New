package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.util.Constant;

public class SignUpPage {
	public SignUpPage()
	{
		PageFactory.initElements(Constant.driver,this);
	}
	public String SignUpurl="https://ijmeet.com/register";
	@FindBy(xpath="//h4[text()=\" Sign Up \"] ")
	private WebElement Signuplogo;
	@FindBy(xpath="//label[text()=\" Full Name \"]")
	private WebElement FullName;
	@FindBy(xpath="//label[text()=\" Company Name \"]")
	private WebElement CompanyName;
	@FindBy(xpath="//label[text()=\" Email Id \"]")
	private WebElement EmailId;
	@FindBy(xpath="//label[text()=\" Mobile Number  \"]")
	private WebElement Mobilenum;
	@FindBy(xpath="//label[text()=\" Passwor \"]")
	private WebElement Password;
	@FindBy(css="input#company_name")
	private WebElement textinCmpnm;
	@FindBy(css="label#company_name-error-server")
	private WebElement entercomapnynamelabel;
	@FindBy(xpath="//input[@placeholder=\" Enter email id \"]")
	private WebElement EmailIdplaceholder;
	@FindBy(css="input#email")
	private WebElement enterTextinemailId;
	
  public boolean SignUplogo_isDisplayed()
  {
	  return Signuplogo.isDisplayed();
    }
  public boolean FullName_isDisplayed()
  {
	  return FullName.isDisplayed();
	  
  }
  public boolean CompanyName_isDisplayed()
  {
	   return CompanyName.isDisplayed();
  }
  public boolean EmailId_isDisplayed()
  {
	  return EmailId.isDisplayed();
  }
  public boolean Mobilenum_isDisplayed()
  {
	  return Mobilenum.isDisplayed();
  }
  public boolean Password_isDisplayed()
  {
	  return Password.isDisplayed();
  }
  public void CompanyNameText()
  {
      textinCmpnm.sendKeys("Testing Guru");
  }
  public boolean enterCompanyName_isDisplayed()
  {
	  return entercomapnynamelabel.isDisplayed();
  }
  public boolean emailIdplaceholder_isDisplayed()
  {
	  return EmailIdplaceholder.isDisplayed();
  }
public void enterTextinmailId()
{
	enterTextinemailId.sendKeys("rani@20gmail.com");
}
public void verifyLengthmailidbox()
{
	enterTextinemailId.sendKeys("agsdgdfhdfhdfhhh");
}
}


