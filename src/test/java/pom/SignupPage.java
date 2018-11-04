package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	static WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lName;
	@FindBy(xpath="//input[@name='reg_email__']")
	
	private WebElement phone;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	@FindBy(xpath="//select[@id='day']")
	private WebElement bDay;
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement bMonth;
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement bYear;
	public WebElement getfName() {
		return fName;
	}

	public void setfName(WebElement fName) {
		this.fName = fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public void setlName(WebElement lName) {
		this.lName = lName;
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(WebElement phone) {
		this.phone = phone;
	}

	public WebElement getbDay() {
		return bDay;
	}

	public void setbDay(WebElement bDay) {
		this.bDay = bDay;
	}

	public WebElement getbMonth() {
		return bMonth;
	}

	public void setbMonth(WebElement bMonth) {
		this.bMonth = bMonth;
	}

	public WebElement getbYear() {
		return bYear;
	}

	public void setbYear(WebElement bYear) {
		this.bYear = bYear;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	@FindBy(xpath="//input[@value='2']")
	private WebElement gender;
	
	public SignupPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
