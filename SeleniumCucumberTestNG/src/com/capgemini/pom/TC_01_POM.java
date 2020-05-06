package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_01_POM {

	WebDriver driver;

	// Declaring Elements for Account&List
	@FindBy(xpath = "(//span[text()=\"Account & Lists\"])[1]")
	private WebElement Accounts;

	// Declaring Elements for EmailID
	@FindBy(name = "email")
	private WebElement emailid;

	// Declaring Elements for Continue button
	@FindBy(xpath = "//input[@id=\"continue\"]")
	private WebElement counitunebutton;

	// Declaring Elements for Password
	@FindBy(id = "ap_password")
	private WebElement pass;

	// Declaring Elements for Rememberme checkbox
	@FindBy(name = "rememberMe")
	private WebElement remember;

	// Declaring Elements for Login Button
	@FindBy(id = "signInSubmit")
	private WebElement login;

	// Declaring Elements for open menu
	@FindBy(id = "nav-hamburger-menu")
	private WebElement open;

	// Declaring Elements for Beauty, Health, Grocery
	@FindBy(xpath = "//div[text()=\"Beauty, Health, Grocery\"]")
	private WebElement grocery;

	// Declaring Elements for All Grocery & Gourmet Foods
	@FindBy(linkText = "All Grocery & Gourmet Foods")
	private WebElement foods;

	// Declaring Elements for Healthy Foods Store
	@FindBy(linkText = "Healthy Foods Store")
	private WebElement store;

	// Declaring Elements for WONDERLAND FOODS (DEVICE) California Raw
	@FindBy(xpath = "//span[text()=\"WONDERLAND FOODS (DEVICE) California Raw…\"]")
	private WebElement dryFruits;

	// Declaring Elements for add-to-cart-button
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart;

	// Declaring Elements for proceed to buy
	@FindBy(id="hlb-ptc-btn-native")
	private WebElement proceed;

	// Declaring Elements for dropdown
	@FindBy(xpath = "(//span[@class=\"a-dropdown-prompt\"])[3]")
	private WebElement options;

	// Declaring Elements for option
	@FindBy(linkText = "State Bank of India")
	private WebElement sbi;

	// Declaring Elements for continue
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	private WebElement continue1;

	// Declaring Elements for place order
	@FindBy(name = "placeYourOrder1")
	private WebElement placeyourorder;

	// Initialization of Constructor
	public TC_01_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization of Account & Lists
	public void accounts() {
		Accounts.click();
	}

	// Utilization of EmailId
	public void emailID(String string) {
		emailid.sendKeys(string);
	}

	// Utilization of Continue Button
	public void continueButton() {
		counitunebutton.click();
	}

	// Utilization of rememberme Checkbox
	public void rememberme() {
		remember.click();
	}

	// Utilization of password
	public void passwordID(String string) {
		pass.sendKeys(string);
	}

	// Utilization of loginButton
	public void loginButton() {
		login.click();
	}

	// Utilization of open menu
	public void openMenu() {
		open.click();
	}

	// Utilization of Beauty, Health, Grocery
	public void groceryItems() {
		grocery.click();
	}

	// Utilization of All Grocery & Gourmet Foods
	public void gourmetFoods() {
		foods.click();
	}

	// Utilization of Healthy Foods Store
	public void foodStore() {
		store.click();
	}

	// Utilization of WONDERLAND FOODS (DEVICE) California Raw
	public void driedFruits() {
		dryFruits.click();
	}

	// Utilization of add-to-cart-button
	public void addToCart() {
		addcart.click();
	}

	// Utilization of proceed to buy
	public void proceedTOBuy() {
		proceed.click();
	}

	// Utilization of dropdown
	public void selectOptions() {
		options.click();
	}

	// Utilization of option
	public void sbiBank() {
		sbi.click();
	}

	// Utilization of continue
	public void continueButton1() {
		continue1.click();
	}

	// Utilization of place order
	public void placeYourOrder() {
		placeyourorder.click();
	}

}
