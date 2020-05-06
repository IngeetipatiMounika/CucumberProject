package com.capgemini.stepdefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.capgemini.pom.TC_02_POM;
import com.capgemini.pom.TC_03_POM;
import com.capgemini.utility.Xlsheet;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03_StepDef {
	/**
	 * User will login to the "amazon" web site using the email id and password
	 */
	WebDriver driver = null;
	TC_03_POM pom = null;
	Xlsheet x = new Xlsheet();

	// User will enter the URL of amazon
	@Given("^User will enter the url$")
	public void user_will_enter_the_url() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(x.run());
	}

	// User will click on Accounts & List
	@When("^User clicks on Accounts & List button on the top$")
	public void user_clicks_on_Accounts_List_button_on_the_top() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new TC_02_POM(driver).accounts();
	}

	// User enters the user name and will click on continue
	@Then("^User will enter the username and click on continue$")
	public void user_will_enter_the_username_and_click_on_continue() throws Exception {
		new TC_02_POM(driver).emailID(x.run1());
		new TC_02_POM(driver).continueButton();
	}

	// User enter the password and will click on login button
	@Then("^User will enter the password and click on login button$")
	public void user_will_enters_the_password_and_click_on_login_button() throws Exception {
		new TC_02_POM(driver).rememberme();
		new TC_02_POM(driver).passwordID(x.run2());
		new TC_02_POM(driver).loginButton();
	}

	/**
	 * User clicks on Amazon pay to know the information regarding the donation of
	 * covid-19
	 */

	// User clicks on Amazon pay
	@Given("^User clicks on Amazon pay$")
	public void user_clicks_on_Amazon_pay() {
		new TC_03_POM(driver).amazonPay();

	}

	// User clicks on covid-19 Donation
	@When("^User clicks on covid-(\\d+) Donation$")
	public void user_clicks_on_covid_Donation(int arg1) {
		new TC_03_POM(driver).covidDonation();
	}

	// User scrolls down and clicks on donate now from habitat for humanity
	@Then("^User scrolls down and clicks on donate now from habitat for humanity$")
	public void user_scrolls_down_and_clicks_on_donate_now_from_habitat_for_humanity() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		new TC_03_POM(driver).Donate();
	}

	// User clicks on About habitat and closes the browser
	@Then("^User clicks on About habitat and closes the browser$")
	public void user_clicks_on_About_habitat_and_closes_the_browser() {
		WebElement e1 = driver.findElement(By.xpath("//a[text()=\"About\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(e1).build().perform();
		new TC_03_POM(driver).about();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.close();
	}
}
