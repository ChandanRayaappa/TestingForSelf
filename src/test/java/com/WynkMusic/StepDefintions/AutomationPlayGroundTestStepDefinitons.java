package com.WynkMusic.StepDefintions;

import com.Automation.pageObejct.SeleniumWebElementsPlaygroundPage;
import com.Automation.utility.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AutomationPlayGroundTestStepDefinitons extends BaseTest {
	SeleniumWebElementsPlaygroundPage	seleniumWebElementsPlaygroundPage=new SeleniumWebElementsPlaygroundPage(driver);
	@Given("Lanuch The Browser and Navigate To AutomationPlaygrounf {string} and validate the DisplayScreen")
	public void lanuch_the_browser_and_navigate_to_automation_playgrounf_and_validate_the_display_screen(String url) {
		
		driver.get(url);
		
		
	}

	@Given("Send the username into userName text filed {string}")
	public void send_the_username_into_user_name_text_filed(String username) {
		seleniumWebElementsPlaygroundPage.getUserNameTextFiled().sendKeys(username);
	}

	@Given("Send the emailID into emailId text filed {string}")
	public void send_the_email_id_into_email_id_text_filed(String emailID) {
		seleniumWebElementsPlaygroundPage.getEmailIdTextField().sendKeys(emailID);
		
	   
	}

	@Then("Send the {string} and {string} into respective text fields")
	public void send_the_and_into_respective_text_fields(String password, String comments) {
		seleniumWebElementsPlaygroundPage.getPasswordTextField().sendKeys(password);
		seleniumWebElementsPlaygroundPage.getComentTextAreaField().sendKeys(comments);
		seleniumWebElementsPlaygroundPage.getMaleGenderRadioBtn().click();
		seleniumWebElementsPlaygroundPage.getReadungHobbiesCheckBox().click();
		seleniumWebElementsPlaygroundPage.getSportsHobbiesCheckBox().click();
	}

}
