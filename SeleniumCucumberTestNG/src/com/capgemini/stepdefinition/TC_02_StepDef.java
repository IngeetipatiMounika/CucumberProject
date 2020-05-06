package com.capgemini.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.capgemini.pom.TC_02_POM;
import com.capgemini.utility.Xlsheet;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_02_StepDef {
	/**
	 * User will login to the "amazon" web site using the email id and password
	 */
	WebDriver driver = null;
	TC_02_POM pom = null;
	Xlsheet x = new Xlsheet();

	// User will enter the URL of amazon
	@Given("^User enters on url$")
	public void user_enters_on_url() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(x.run());
	}

	// User will click on Accounts & List
	@When("^User clicks on Accounts & List button$")
	public void user_clicks_on_Accounts_List_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_02_POM(driver).accounts();
	}

	// User enters the user name and will click on continue
	@Then("^User enters the username and click on continue$")
	public void user_enters_the_username_and_click_on_continue() throws Throwable {
		new TC_02_POM(driver).emailID(x.run1());
		new TC_02_POM(driver).continueButton();
	}

	// User enter the password and will click on login button
	@Then("^User enters the password and click on login button$")
	public void user_enters_the_password_and_click_on_login_button() throws Exception {
		new TC_02_POM(driver).rememberme();
		new TC_02_POM(driver).passwordID(x.run2());
		new TC_02_POM(driver).loginButton();
	}

	/**
	 * User clicks on Buy again button and select the product
	 * but the products are currently not available that's why
	 * we simply close it and logout from the application.
	 */
	
	// User will click on Buy Again
	@Given("^User clicks on Buy Again$")
	public void user_clicks_on_Buy_Again() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_02_POM(driver).buyAgain();
	}

	// User will click on Your orders
	@When("^User clicks on Your orders$")
	public void user_clicks_on_Your_orders() {
		new TC_02_POM(driver).yourOrders();
	}

	// User will click on drop down button
	@Then("^User clicks on dropdown button$")
	public void user_clicks_on_dropdown_button() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_02_POM(driver).dropDown();
		new TC_02_POM(driver).options();
	}

	// User will click on Buy again button in any of the product
	@Then("^User clicks on Buyagain button in any of the product$")
	public void user_clicks_on_Buyagain_button_in_any_of_the_product() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_02_POM(driver).againBuy();
		new TC_02_POM(driver).alertClick();

	}

	// User will log out of the application
	@And("^User logs out of the application$")
	public void User_logs_out_of_the_application() {
		new TC_02_POM(driver).openMenu();
		new TC_02_POM(driver).signOut();
		driver.close();
	}

}
