package com.leaftaps_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {

	WebDriver driver;

	public CreateLeadPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "username")
	private WebElement name;

	public WebElement getNmae(String enterName) {
		name.sendKeys(enterName);
		return name;
	}

	@FindBy(how = How.ID, using = "password")
	private WebElement pass;

	public WebElement getPassword(String enterPass) {
		pass.sendKeys(enterPass);
		return pass;
	}

	@FindBy(how = How.XPATH, using = "//form[@id='login']/p[3]/input")
	private WebElement login;

	public void getLoginButton() {
		login.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@id='button']/a/img")
	private WebElement SFAButton;

	public void enterButton() {
		SFAButton.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@id='left-content-column']/div/div[2]/ul/li/a")
	private WebElement lead;

	public void getLeadButton() {
		lead.click();
	}

	@FindBy(how = How.XPATH, using = "(//input[@name=\"companyName\"])[2]")
	private WebElement company;

	public WebElement getCompanyName(String companyName) {

		company.sendKeys(companyName);
		return company;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='parentPartyId']")
	private WebElement prAccount;

	public WebElement getAccount(String enternum) {
		prAccount.sendKeys(enternum);
		return prAccount;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='createLeadForm_firstName']")
	private WebElement firstname;

	public WebElement FirstName(String enterFirstName) {
		firstname.sendKeys(enterFirstName);
		return firstname;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='createLeadForm_lastName']")
	private WebElement lastName;

	public WebElement getLNmae(String enterLastName) {
		lastName.sendKeys(enterLastName);
		return lastName;
	}

	@FindBy(how = How.NAME, using = "dataSourceId")
	private WebElement source;

	public WebElement getDropDown(String enterValue) {
		Select select = new Select(source);
		select.selectByVisibleText(enterValue);
		return source;
	}

	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	private WebElement marketingCamp;

	public WebElement getDropdown2(String enterValuetwo) {
		Select select = new Select(marketingCamp);
		select.selectByVisibleText(enterValuetwo);
		return marketingCamp;
	}

	@FindBy(how = How.NAME, using = "firstNameLocal")
	private WebElement local;

	public WebElement getLocalButton(String enterLcalValue) {
		local.sendKeys(enterLcalValue);
		return local;
	}

	@FindBy(how = How.NAME, using = "lastNameLocal")
	private WebElement localLName;

	public WebElement getlocalLNameButton(String enterLocalValue) {
		localLName.sendKeys(enterLocalValue);
		return localLName;
	}

	@FindBy(how = How.NAME, using = "personalTitle")
	private WebElement Salutation;

	public WebElement getSalutation(String getSalutation) {
		Salutation.sendKeys(getSalutation);
		return SFAButton;
	}

	// Calendar image click
	@FindBy(how = How.XPATH, using = "//img[@alt='View Calendar']")
	private WebElement calendarimage;

	public WebElement calendaImage() {
		calendarimage.click();
		return calendarimage;
	}

	@FindBy(how = How.XPATH, using = "//*[text()='«']")
	private WebElement year;

	public WebElement calendaYear() {
		year.click();
		return year;
	}

	@FindBy(how = How.XPATH, using = "//*[text()='›']")
	private WebElement month;

	public WebElement calendaMonth() {
		month.click();
		return month;
	}

	@FindBy(how = How.XPATH, using = "(//td[@class='day'])[10]")
	private WebElement day;

	public WebElement calendaDay() {
		day.click();
		return day;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='fieldgroup-body']/table/tbody/tr[6]/td[2]/input")
	private WebElement title;

	public WebElement getTitle(String enterTitle) {
		title.sendKeys(enterTitle);
		return title;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='fieldgroup-body']/table/tbody/tr[6]/td[4]/input")
	private WebElement department;

	public WebElement getDepartment(String enterDepartMent) {
		department.sendKeys(enterDepartMent);
		return department;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='fieldgroup-body']/table/tbody/tr[7]/td[2]/input")
	private WebElement reveneue;

	public WebElement getReveneue(String enterReveneue) {
		reveneue.sendKeys(enterReveneue);
		return reveneue;
	}

	@FindBy(how = How.NAME, using = "industryEnumId")
	private WebElement industry;

	public WebElement getIndustry(String enterIndustryName) {
		Select select = new Select(industry);
		select.selectByVisibleText(enterIndustryName);
		return industry;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='createLeadForm_currencyUomId']")
	private WebElement currency;

	public WebElement getCurrency(String enterCurrencyName) {
		Select select = new Select(currency);
		select.selectByVisibleText(enterCurrencyName);
		return currency;
	}

	@FindBy(how = How.NAME, using = "ownershipEnumId")
	private WebElement ownership;

	public WebElement getOwnership(String enterOwner) {
		Select select = new Select(ownership);
		select.selectByVisibleText(enterOwner);
		return ownership;
	}

	@FindBy(how = How.NAME, using = "numberEmployees")
	private WebElement em_member;

	public WebElement getmember(String enterMemberNum) {
		em_member.sendKeys(enterMemberNum);
		return em_member;
	}

	@FindBy(how = How.NAME, using = "sicCode")
	private WebElement simCode;

	public WebElement getSimCodeNum(String enterCode) {
		simCode.sendKeys(enterCode);
		return simCode;
	}

	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement descrip;

	public WebElement getdescrip(String enterdescription) {
		descrip.sendKeys(enterdescription);
		return descrip;

	}

	@FindBy(how = How.NAME, using = "tickerSymbol")
	private WebElement symble;

	public WebElement getTicketSymble(String entersymble) {
		symble.sendKeys(entersymble);
		return symble;
	}

	@FindBy(how = How.NAME, using = "importantNote")
	private WebElement note;

	public WebElement getNoteButton(String enterNote) {
		note.sendKeys(enterNote);
		return note;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneCountryCode")
	private WebElement remove;

	public void getRemove() {
		remove.click();
		Actions actions = new Actions(driver);
		actions.click(driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build()
		.perform();
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneCountryCode")
	private WebElement countrycode;

	public WebElement getCountryCode(String entercountrycode) {
		countrycode.sendKeys(entercountrycode);
		return countrycode;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement phoneNum;

	public WebElement getphoneNumber(String enterPnumber) {
		phoneNum.sendKeys(enterPnumber);
		return phoneNum;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement areacode;

	public WebElement getareacodeButton(String enterareacode) {
		areacode.sendKeys(enterareacode);
		return areacode;
	}

	@FindBy(how = How.NAME, using = "primaryPhoneAskForName")
	private WebElement askFor;

	public WebElement getPrimaryAskFor(String enterQuestion) {
		askFor.sendKeys(enterQuestion);
		return askFor;
	}

	@FindBy(how = How.NAME, using = "primaryPhoneExtension")
	private WebElement extension;

	public WebElement getExtension(String enterextension) {
		extension.sendKeys(enterextension);
		return extension;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement email;

	public WebElement getEmailButton(String enteremail) {
		email.sendKeys(enteremail);
		return email;

	}

	@FindBy(how = How.NAME, using = "primaryWebUrl")
	private WebElement url;

	public WebElement getUrlButton(String enterUrl) {
		url.sendKeys(enterUrl);
		return url;

	}
	
	@FindBy(how=How.NAME , using="generalToName") private WebElement toName ;
	public WebElement getToNmae (String entertoName) {
		toName.sendKeys(entertoName);
		return toName;
	}
	
	
	@FindBy(how=How.NAME , using="generalAttnName") private WebElement attentionName ;
	public WebElement getAttentionName (String enterattentionName) {
		attentionName.sendKeys(enterattentionName);
		return attentionName;
	}
	
	
	@FindBy(how=How.NAME , using="generalAddress1") private WebElement addressOne  ;
	public WebElement getAddressOne (String enteraddressOne) {
		addressOne.sendKeys(enteraddressOne);
		return addressOne;
	}
	
	
	@FindBy(how=How.NAME , using="generalAddress2") private WebElement addressTwo;
	public WebElement getAddressTwo (String enterAddressTwo) {
		addressTwo.sendKeys(enterAddressTwo);
		return addressTwo;
	}
	
	
	
	@FindBy(how=How.NAME , using="generalCity") private WebElement city;
	public WebElement getCity (String enterCity) {
		city.sendKeys(enterCity);
		return city;
	}
	
	
	
	@FindBy(how=How.ID , using="createLeadForm_generalStateProvinceGeoId") private WebElement state ;
	public WebElement getState (String enterState) {
		Select select = new Select(state);
		select.selectByVisibleText(enterState);
		return state;
	}
	
	
	@FindBy(how=How.XPATH , using="//input[@id='createLeadForm_generalPostalCode']") private WebElement zipcode;
	public WebElement getZipCode (String enterzip) {
		zipcode.sendKeys(enterzip);
		return zipcode;
	}
	
	
	@FindBy(how=How.NAME , using="generalCountryGeoId") private WebElement countryname ;
	public WebElement getCountryName (String entercountry) {
		Select select = new Select(countryname);
		select.selectByVisibleText(entercountry);
		return countryname;
		
	}
	
	
	
	@FindBy(how=How.NAME , using="generalPostalCodeExt") private WebElement postalcode ;
	public WebElement getPostalcode (String enterpostalcode) {
		postalcode.sendKeys(enterpostalcode);
		return postalcode;
	}
	
	
	
	@FindBy(how=How.XPATH , using="//input[@name='submitButton']") private WebElement submit ;
	public void getSubmitButton() {
		submit.click();
	}
	
	
	

}
