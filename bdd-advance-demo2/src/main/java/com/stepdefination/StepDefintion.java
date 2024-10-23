package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefintion {
	WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/ameyaathale/Documents/Selenium_Automation_Workspace/chromedriver-mac-x64/chromedriver");
		driver = new ChromeDriver();
		driver.get("file:///Users/ameyaathale/Desktop/Selenium%20Software/Offline%20Website/index.html");
	}
	 @After
	 public void tearDown() {
		 driver.close();
	 }

	//@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ameyaathale/Documents/Selenium_Automation_Workspace/chromedriver-mac-x64/chromedriver");
		driver = new ChromeDriver();
		driver.get("file:///Users/ameyaathale/Desktop/Selenium%20Software/Offline%20Website/index.html");
	}

	@Then("^user verify title of home page$")
	public void user_verify_title_of_home_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	
	
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();

	}

	@Then("^user verify \"([^\"]*)\"$")
	public void user_verify(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}

	@SuppressWarnings("deprecation")
	@Then("^user should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {
		WebElement logo_element = driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo_element.isDisplayed());
	}
		
	}


