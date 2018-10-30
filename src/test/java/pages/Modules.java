package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;

public class Modules implements BaseTest
{
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='btn btn-flat log_out']")
	public WebElement logoutBtn;
	
	@FindBy(xpath="(//*[@class='btn btn-info'])[1]")
	public WebElement okForLogout;
	
	@FindBy(xpath="(//*[text()='Dashboard'])[1]")
	public WebElement dashboardModule;
	
	@FindBy(xpath="(//*[text()='Dashboard'])[2]")
	public WebElement dashboardSubModule;
	
	@FindBy(xpath="//*[text()='System Admin/Master Data']")
	public WebElement masterDataModule;
	
	@FindBy(xpath="//*[text()='Language']")
	public WebElement language;
	
	@FindBy(xpath="//*[text()='Country ']")
	public WebElement country;
	
	@FindBy(xpath="//*[text()='State ']")
	public WebElement state;
	
	@FindBy(xpath="//*[text()='City']")
	public WebElement city;
	
	@FindBy(xpath="//*[text()='Village']")
	public WebElement village;
	
	@FindBy(xpath="//*[text()='Main Menus']")
	public WebElement mainMenus;
	
	@FindBy(xpath="//*[text()='Sub Menus']")
	public WebElement subMenus;
	
	@FindBy(xpath="Activity Logs")
	public WebElement activityLog;
	
	@FindBy(xpath="//*[text()='User Management']")
	public WebElement userManagement;
	
	@FindBy(xpath="//*[text()='Users']")
	public WebElement users;
	
	@FindBy(xpath="//*[text()='Role Management']")
	public WebElement roleManagement;
	
	@FindBy(xpath="//*[text()='Roles']")
	public WebElement roles;
	
	@FindBy(xpath="//*[text()='Role Permission']")
	public WebElement rolePermission;
	
	@FindBy(xpath="//*[text()='Survey Management']")
	public WebElement surveyManagement;
	
	@FindBy(xpath="//*[text()='Survey Types']")
	public WebElement surveyTypes;
	
	@FindBy(xpath="//*[text()='Survey Categories']")
	public WebElement surveyCategory;
	
	@FindBy(xpath="//*[text()='Create Survey']")
	public WebElement createSurvey;
	
	@FindBy(xpath="//*[text()='Assign Users to Survey']")
	public WebElement assignUsersToSurvey;
	
	@FindBy(xpath="//*[text()='Question Management']")
	public WebElement questionManagement;
	
	@FindBy(xpath="//*[text()='Question Group']")
	public WebElement questionGroup;
	
	@FindBy(xpath="//*[text()='Question Type']")
	public WebElement questionType;
	
	@FindBy(xpath="//*[text()='Questions']")
	public WebElement questions;
	
	@FindBy(xpath="//*[text()='Survey Questions']")
	public WebElement surveyQuestions;
	
	@FindBy(xpath="//*[text()='Clone Survey Questions']")
	public WebElement cloneSurveyQuestions;
	
	@FindBy(xpath="//*[text()='Assign Questions to Survey']")
	public WebElement assignQuestionsToSurvey;
	
	@FindBy(xpath="//*[text()='Device Management']")
	public WebElement deviceManagement;
	
	@FindBy(xpath="//*[text()='Devices']")
	public WebElement devices;
	
	@FindBy(xpath="//*[text()='Assign Device']")
	public WebElement assignDevice;
	
	@FindBy(xpath="//*[text()='Notification Management']")
	public WebElement notificationManagement;
	
	@FindBy(xpath="//*[text()='Create Notification']")
	public WebElement createNotification;
	
	@FindBy(xpath="//*[text()='Create Global Notification']")
	public WebElement createGlobalNotification;
	
	@FindBy(xpath="//*[text()='Assign Notification']")
	public WebElement assignNotification;
	
	@FindBy(xpath="//*[text()='Mobile App Parameters']")
	public WebElement mobileAppParameters;
	
	@FindBy(xpath="//*[text()='Field Names']")
	public WebElement fieldNames;
	
	@FindBy(xpath="//*[text()='Mobile Screens']")
	public WebElement mobileScreens;
	
	@FindBy(xpath="//*[text()='Mobile Screen Fields']")
	public WebElement mobileScreenFields;
	
	@FindBy(xpath="//*[text()='Screens']")
	public WebElement screens;
	
	@FindBy(xpath="//*[text()='Configurations']")
	public WebElement configurations;
	
	@FindBy(xpath="//*[text()='Reports']")
	public WebElement reports;
	
	@FindBy(xpath="//*[text()='Survey Results']")
	public WebElement surveyResults;
	
	@FindBy(xpath="//*[text()='Batch Management']")
	public WebElement batchManagement;
	
	@FindBy(xpath="//*[text()='Batch']")
	public WebElement batch;
	
	@FindBy(xpath="(//*[text()='Message Management'])[1]")
	public WebElement messageManagementModule;
	
	@FindBy(xpath="(//*[text()='Message Management'])[2]")
	public WebElement messageManagementSubModule;
	
	public Modules(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		clickObj.click(logoutBtn);
		navigationObj.switchToActiveElement();
		clickObj.click(okForLogout);
	}
	
	public void clickDashboardSubModule()
	{
		clickObj.click(dashboardModule);
		clickObj.click(dashboardSubModule);
	}
	
	public void clickLanguage()
	{
		clickObj.click(masterDataModule);
		clickObj.click(language);
	}
	
	public void clickCountry()
	{
		clickObj.click(masterDataModule);
		clickObj.click(country);
	}
	
	public void clickState()
	{
		clickObj.click(masterDataModule);
		clickObj.click(state);
	}
	
	public void clickCity()
	{
		clickObj.click(masterDataModule);
		clickObj.click(city);
	}
	
	public void clickVillage()
	{
		clickObj.click(masterDataModule);
		clickObj.click(village);
	}
	
	public void clickMainMenus()
	{
		clickObj.click(masterDataModule);
		clickObj.click(mainMenus);
	}
	
	public void clickSubMenus()
	{
		clickObj.click(masterDataModule);
		clickObj.click(subMenus);
	}
	
	public void clickActivityLogs()
	{
		clickObj.click(masterDataModule);
		clickObj.click(activityLog);
	}
	
	public void clickUsers()
	{
		clickObj.click(userManagement);
		clickObj.click(users);
	}
	
	public void clickRoles()
	{
		clickObj.click(roleManagement);
		clickObj.click(roles);
	}
	
	public void clickRolePermission()
	{
		clickObj.click(roleManagement);
		clickObj.click(rolePermission);
	}
	
	public void clickSurveyTypes()
	{
		clickObj.click(surveyManagement);
		clickObj.click(surveyTypes);
	}
	
	public void clickSurveyCategory()
	{
		clickObj.click(surveyManagement);
		clickObj.click(surveyCategory);
	}
	
	public void clickCreateSurvey()
	{
		clickObj.click(surveyManagement);
		clickObj.click(createSurvey);
	}
	
	public void clickAssignUsersToSurvey()
	{
		clickObj.click(surveyManagement);
		clickObj.click(assignUsersToSurvey);
	}
	
	public void clickQuestionGroup()
	{
		clickObj.click(questionManagement);
		clickObj.click(questionGroup);
	}
	
	public void clickQuestionType()
	{
		clickObj.click(questionManagement);
		clickObj.click(questionType);
	}
	
	public void clickQuestions()
	{
		clickObj.click(questionManagement);
		clickObj.click(questions);
	}
	
	public void clickSurveyQuestions()
	{
		clickObj.click(questionManagement);
		clickObj.click(surveyQuestions);
	}
	public void clickCloneSurveyQuestions()
	{
		clickObj.click(questionManagement);
		clickObj.click(cloneSurveyQuestions);
	}
	
	public void clickAssignQuestionsToSurvey()
	{
		clickObj.click(questionManagement);
		clickObj.click(assignQuestionsToSurvey);
	}
	


	
}
