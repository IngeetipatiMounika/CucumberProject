package com.capgemini.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TC_02_POM {
	
	WebDriver driver = null;

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

	// Declaring Elements for Buy Again
	@FindBy(linkText = "Buy Again")
	private WebElement buyagain;

	// Declaring Elements for Your Orders
	@FindBy(linkText = "Your Orders")
	private WebElement orders;

	// Declaring Elements for dropdown
	@FindBy(xpath = "//span[@class=\"a-dropdown-prompt\"]")
	private WebElement dropdown;

	// Declaring Elements for option
	@FindBy(linkText = "2018")
	private WebElement year;

	// Declaring Elements for Buy it again
	@FindBy(linkText = "Buy it again")
	private WebElement again;

	// Declaring Elements for alert
	@FindBy(xpath = "(//span[@class=\"a-button-inner\"])[15]")
	private WebElement alert;

	// Declaring Elements for open menu
	@FindBy(id = "nav-hamburger-menu")
	private WebElement open;

	// Declaring Elements for sign out
	@FindBy(linkText = "Sign Out")
	private WebElement signout;

	// Initialization of Constructor
	public TC_02_POM(WebDriver driver) {
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

	// Utilization of buyAgain
	public void buyAgain() {
		buyagain.click();
	}

	// Utilization of yourOrders
	public void yourOrders() {
		orders.click();
	}

	// Utilization of dropDown
	public void dropDown() {
		dropdown.click();

	}

	// Utilization of option
	public void options() {
		year.click();
	}

	// Utilization of BuyAgain
	public void againBuy() {
		again.click();
	}

	// Utilization of alertButton
	public void alertClick() {
		alert.click();
	}

	// Utilization of openMenu
	public void openMenu() {
		open.click();
	}

	// Utilization of signOut
	public void signOut() {
		signout.click();
	}
}
