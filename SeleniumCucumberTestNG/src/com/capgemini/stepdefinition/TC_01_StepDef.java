package com.capgemini.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.capgemini.pom.TC_01_POM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.capgemini.utility.Xlsheet;

public class TC_01_StepDef {
	/**
	 * User will login to the "amazon" website using the emailid and password
	 */

	WebDriver driver = null;
	TC_01_POM pom = null;
	Xlsheet x = new Xlsheet();

	// User will enter the URL of amazon
	@Given("^User enters the url$")
	public void user_enters_the_url() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(x.run());
	}

	// User will click on Accounts & List
	@When("^User clicks on Accounts & List$")
	public void user_clicks_on_Accounts_List() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_01_POM(driver).accounts();
	}

	// User enters the username and will click on continue
	@Then("^Enter username and click on continue$")
	public void enter_username_and_click_on_continue() throws Exception {
		new TC_01_POM(driver).emailID(x.run1());
		new TC_01_POM(driver).continueButton();
	}

	// User enter the password and will click on login button
	@Then("^Enter password and click on login button$")
	public void enter_password_and_click_on_login_button() throws Exception {
		new TC_01_POM(driver).rememberme();
		new TC_01_POM(driver).passwordID(x.run2());
		new TC_01_POM(driver).loginButton();
	}

	/**
	 * User clicks on open menu>>Beauty,Health,Grocery>>All Grocery & Gourmet
	 * Foods>>Healthy Food Store>>dry fruits>>Add to cart>>payment method>>place your order
	 * 
	 */

	// User will click on open menu button
	@When("^User clicks on open menu on left side corner$")
	public void user_clicks_on_open_menu_on_left_side_corner() {
		new TC_01_POM(driver).openMenu();
	}

	// User will click on Beauty,Health,Grocery
	@Then("^User clicks on Beauty,Health,Grocery$")
	public void user_clicks_on_Beauty_Health_Grocery() {
		new TC_01_POM(driver).groceryItems();
	}

	// User clicks on All Grocery & Gourmet Foods
	@Then("^User clicks on All Grocery & Gourmet Foods$")
	public void user_clicks_on_All_Grocery_Gourmet_Foods() {
		new TC_01_POM(driver).gourmetFoods();
	}

	// User Clicks on Healthy Food Store from Featured Stores
	@Then("^User Clicks on Healthy Food Store from Featured Stores$")
	public void user_Clicks_on_Healthy_Food_Store_from_Featured_Stores() {
		new TC_01_POM(driver).foodStore();
	}

	// User Clicks on WONDERLAND FOODS (DEVICE) California Raw
	@Then("^User Clicks on WONDERLAND FOODS California Raw$")
	public void user_Clicks_on_WONDERLAND_FOODS_California_Raw() {
		new TC_01_POM(driver).driedFruits();
		
	}

	// User clicks on add to cart and then proceed to buy
	@And("^User clicks on add to cart and then proceed to buy$")
	public void User_clicks_on_add_to_cart_and_then_proceed_to_buy() {
		new TC_01_POM(driver).addToCart();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_01_POM(driver).proceedTOBuy();
		
	}

	// User clicks on Net banking and click on continue
	@And("^User clicks on Netbanking and click on continue$")
	public void User_clicks_on_Netbanking_and_click_on_continue() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_01_POM(driver).selectOptions();
		new TC_01_POM(driver).sbiBank();
		new TC_01_POM(driver).continueButton1();
	}

	// Finally User clicks on place your order and will close the browser
	@And("^Finally User clicks on place your order and will close the browser$")
	public void Finally_User_clicks_on_place_your_order_and_will_close_the_browser() {
		new TC_01_POM(driver).placeYourOrder();
		driver.close();
	}

}
