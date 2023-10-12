package com.leaftaps_Tests;

import org.testng.annotations.Test;

import com.leaftaps_BaseTest.BaseTest;
import com.leaftaps_Pages.CreateLeadPage;

public class CreateLeadTest extends BaseTest {

	CreateLeadPage c;

	@Test(priority = 1)
	public void loginButton() {
		c = new CreateLeadPage(driver);
		c.getNmae("DemoSalesManager");
		c.getPassword("crmsfa");
		c.getLoginButton();
	}

	@Test(priority = 2)
	public void enterButton() {
		c = new CreateLeadPage(driver);
		c.enterButton();
		//c.getLeadButton();
	}

	@Test(priority = 3)
	public void leadButton() {
		c = new CreateLeadPage(driver);
		c.getLeadButton();
		c.getCompanyName("HR Group");
		c.getAccount("10253");
		c.FirstName("Hamidur");
		c.getLNmae("Rahman");
		c.getDropDown("Direct Mail");
		c.getDropdown2("Catalog Generating Marketing Campaigns");
		c.getLocalButton("munna");
		c.getlocalLNameButton("fgfh");
		c.getSalutation("IT");
		c.calendaImage();
		c.calendaYear();
		c.calendaMonth();
		c.calendaDay();
		c.getTitle("Software Tester");
		c.getDepartment("IT Department");
		c.getReveneue("one core");
		c.getIndustry("Aerospace");
		c.getCurrency("AMD - Armenian Dram");
		c.getOwnership("Public Corporation");
		c.getmember("20000");
		c.getSimCodeNum("3160");
		c.getdescrip("It is a IT development farm.");
		c.getTicketSymble("$$$");
		c.getNoteButton("Do not need to take risk");

	}

	@Test(priority = 4)
	public void contactInformantion() {

		c = new CreateLeadPage(driver);
		c.getRemove();
		c.getCountryCode("000");
		c.getphoneNumber("01252524");
		c.getareacodeButton("0123");
		c.getPrimaryAskFor("01220222");
		c.getExtension("abcdj123");
		c.getEmailButton("abc@gmailcom");
		c.getUrlButton("http://leaftaps.com/crmsfa/control/createLead");

	}
	
	
	@Test(priority = 5)
	public void primaryAddress() {
		c = new CreateLeadPage(driver);
		c.getToNmae("Ayzal");
		c.getAttentionName("Rahman");
		c.getAddressOne("Sylhet");
		c.getAddressTwo("Uposhahar");
		c.getCity("Sylhet");
		c.getState("California");
		c.getZipCode("3698");
		c.getCountryName("United States");
		c.getPostalcode("3698");
			
	}
	
	
	
	@Test(priority = 6)
	public void createButton() {
		c = new CreateLeadPage(driver);
		c.getSubmitButton();
	}
	
	
	
	
	
	

}
