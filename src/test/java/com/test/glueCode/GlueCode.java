package com.test.glueCode;


import com.test.BaseClass.TestBase;

import com.test.Pages.*;
import com.test.Utils.CommonFunctions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class GlueCode  extends TestBase {

	public LoginPage loginPage;
	public MyInfoPage myInfoPage;
	public AdminPage adminPage;
	public PIMPage pimPage;

	@Before
	public void LaunchBrowser() throws Exception {

		TestBase.initialization();
		loginPage = new LoginPage();
		myInfoPage = new MyInfoPage();
		adminPage = new AdminPage();
		pimPage = new PIMPage();
	}

	@After
	public void Hide() throws Exception {

		TestBase.CloseBrowser();
	}

	@Given("I Navigate to OrangeHRM URL")
	public void I_Navigate_to_OrangeHRM_URL()  {

		webdriver.get(CommonFunctions.getOrangeHRMURL());
	}

	@When("I Enters Valid Username and Valid Password")
	public void I_Enters_Valid_Username_and_Valid_Password()  {
		loginPage.UserNamefld.sendKeys(CommonFunctions.getUserName());
		loginPage.passwordfld.sendKeys(CommonFunctions.getPassword());
	}

	@Then("^I Clicks On Login Button$")
	public void user_Clicks_On_Login_Button()  {
		loginPage.loginButton.click();
		}

	@Then("^I Should be able to Login into Application$")
	public void user_Should_be_able_to_Login_into_Application() throws InterruptedException {
		Thread.sleep(9000);
		Assert.assertTrue(myInfoPage.Marketplace.isDisplayed());
		}

	@When("^I Enters InValid Username (.*) and InValid Password (.*)$")
	public void i_enters_in_valid_username_admin_and_in_valid_password_pass(String UserName, String Password) {

		loginPage.UserNamefld.sendKeys(UserName);
		loginPage.passwordfld.sendKeys(Password);
	}

	@Then("I Should Not be able to Login into Application")
	public void i_should_not_be_able_to_login_into_application() {
		Assert.assertTrue(loginPage.invalidCredentialsmsg.isDisplayed());
	}

	@Given("I Navigate to Orange HRM URL And Login to the Application")
	public void INavigatetoOrangeHRMURLAndLogintotheApplication()  {

		webdriver.get(CommonFunctions.getOrangeHRMURL());
		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage.UserNamefld.sendKeys(CommonFunctions.getUserName());
		loginPage.passwordfld.sendKeys(CommonFunctions.getPassword());
		loginPage.loginButton.click();
		new WebDriverWait(webdriver, 40).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Marketplace']")));
	}

	@Then("I Click on {string} Link on Main Page")
	public void IClickOnHeaderLinks(String LinkName){
		adminPage.ClickOnRespectiveMainMenuLink(LinkName);

	}

	@When("I Click on {string} User button")
	public void ClickOnGenericWebButtons(String Button){
		adminPage.ClickOnGenericWebButtons(Button);

	}

	@Then("^I Enter following User details in Add User Page$")
	public void IEnterUserdetailsinAddUserPage(DataTable DataTable) throws InterruptedException {
		adminPage.EnterUserDetailsOnAddUserPage(DataTable);

	}

	@Then("^I Click on Nationalities Link under Admin Section$")
	public void IClickonNationalitiesLinkunderAdminSection() throws InterruptedException {
		adminPage.nationalitiesLink.click();

	}

	@Then("^I Validate the list of Nationalities in the page are as Expected$")
	public void ValidateNationalitiesinWebPage() throws InterruptedException, IOException {
		adminPage.ValidateNationalities();

	}


	@When("I Click on {string} Menu Icon")
	public void ClickOnSubMenuIcon(String MenuName){
		pimPage.ClickOnGenericSubMenus(MenuName);

	}

	@When("I Create New Employee in Add Employee Page")
	public void ICreateNewEmployeeinAddEmployeePageEmployeePage() throws IOException, InterruptedException {
		pimPage.AddNewEmployeeinHRMSSystem();

	}

	@Then("I Search Employee by Employee Name in Employee List Page")
	public void ISearchEmployeebyEmployeeNameinEmployeeListPage() throws IOException, InterruptedException {
		pimPage.SearchEmployeeByEmployeeName();

	}


	@Then("I Validate Whether the Employee is Created in the System")
	public void IValidateWhethertheEmployeeisCreatedintheSystem() throws IOException, InterruptedException {
		pimPage.validateEmployeisCreatedOrNotinTheSystem();

	}

	@Then("I validate wheather all the Web Elements are displayed in the Login Page")
	public void IvalidatewheatheralltheWebElementsaredisplayedintheLoginPage() throws IOException, InterruptedException {


		Assert.assertTrue(loginPage.FooterLink.isDisplayed());
		Assert.assertTrue(loginPage.orangeHrmLogo.isDisplayed());
		Assert.assertFalse(loginPage.SocialIcons.isEmpty());
		Assert.assertEquals(loginPage.SocialIcons.size(),4);
		Assert.assertTrue(loginPage.FooterElements.isDisplayed());





	}


}
