package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.SignupPage;

public class StepDefinition extends BaseClass {
	
	static WebDriver driver;
	static SignupPage s;
	
	@Given("^lanch the browser and enter the url$")
	public void lanch_the_browser_and_enter_the_url() throws Throwable {
	    
	    driver=getDriver("chrome");
	}

	@When("^user gives first name \"([^\"]*)\"$")
	public void user_gives_first_name(String fname) throws Throwable {
	    s=new SignupPage(driver);
	    setText(s.getfName(),fname );
	    
	}

	@Then("^user gives lastname \"([^\"]*)\"$")
	public void user_gives_lastname(String lName) throws Throwable {
	    
		 s=new SignupPage(driver);
		    setText(s.getlName(),lName );
	}

	@Then("^user gives mobile number \"([^\"]*)\"$")
	public void user_gives_mobile_number(String pNumber) throws Throwable {
	    
		 s=new SignupPage(driver);
		    setText(s.getPhone(),pNumber );
	}
	
	@Then("^user gives password \"([^\"]*)\"$")
	public void user_gives_password(String pass) throws Throwable {
	  
		 s=new SignupPage(driver);
		    setText(s.getPass(),pass );
	}



	@Then("^user gives day \"([^\"]*)\"$")
	public void user_gives_day(String bDay) throws Throwable {
	    
		 s=new SignupPage(driver);
		 selectDrop(s.getbDay(),bDay );
		    
	}

	@Then("^user gives month \"([^\"]*)\"$")
	public void user_gives_month(String bMonth) throws Throwable {
		 s=new SignupPage(driver);
		    selectDrop(s.getbMonth(),bMonth );
	    
	}

	@Then("^user gives year \"([^\"]*)\"$")
	public void user_gives_year(String bYear) throws Throwable {
	    
		 s=new SignupPage(driver);
		    selectDrop(s.getbYear(),bYear );
	}

	@Then("^user click gender$")
	public void user_click_gender() throws Throwable {// Write code here that turns the phrase above into concrete actions
		s=new SignupPage(driver);
		btnclick(s.getGender());
	}

	@Then("^user click signup$")
	public void user_click_signup() throws Throwable {
		
	}



}
