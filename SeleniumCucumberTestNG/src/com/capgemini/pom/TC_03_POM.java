package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_03_POM {
	
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
	
	// Declaring Elements for Amazon Pay	
	@FindBy(linkText = "Amazon Pay")
	private WebElement amazonPay;
	
	// Declaring Elements for COVID-19 Donation
	@FindBy(xpath = "//span[text()=\"COVID-19 Donation\"]")
	private WebElement covidDonation;
	
	// Declaring Elements for donation
	@FindBy(xpath = "(//div[@class=\"bxc-grid__image   bxc-grid__image--light\"])[10]")
	private WebElement donate;
	
	// Declaring Elements for About
	@FindBy(linkText = "Habitat Overview")
	private WebElement about;

	//initilization of constructor
	public TC_03_POM(WebDriver driver) {
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
	// Utilization of amazonPay
	public void amazonPay() {
		amazonPay.click();
	}
	// Utilization of covidDonation
	public void covidDonation() {
		covidDonation.click();
	}
	// Utilization of Donation
	public void Donate() {
		donate.click();
	}
	// Utilization of About
	public void about() {
		about.click();
	}

}
