package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;

public class Loginpage implements BaseTest
{
	public WebDriver driver;
	@FindBy(name="u_email")
	public WebElement userid;

	@FindBy(name="u_password")
	public WebElement pwd;

	@FindBy(name="aLoginBtn")
	public WebElement loginBtn;
	
	@FindBy(xpath="//*[@class='btn btn-flat log_out']")
	public WebElement logoutBtn;
	
	@FindBy(xpath="(//*[@class='btn btn-info'])[1]")
	public WebElement okForLogout;
	
	@FindBy(xpath="//*[text()='The email is required']")
	public WebElement blankEmailErr;
	
	@FindBy(xpath="//*[text()='The password is required']")
	public WebElement blankPwdErr;
	
	@FindBy(xpath="//*[text()='The input is not a valid email address']")
	public WebElement invalidEmailErr;
	
	@FindBy(xpath="//*[text()='Please enter valid Email and Password.']")
	public WebElement invalidEmailPwdErr;
	
	
	
	public Loginpage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void fillUserId(String x)
	{
		inputObj.enterText(userid, x);
		
	}
	
	public void fillpwd(String x)
	{
		inputObj.enterText(pwd, x);
		
	}
	
	public void clickLoginBtn()
	{
		clickObj.click(loginBtn);
	}
	
	public void clickLogout()
	{
		clickObj.click(logoutBtn);
	}
	
	public void clickOk()
	{
		clickObj.click(okForLogout);
	}
}

