package com.Automation.pageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumWebElementsPlaygroundPage {
	
	@FindBy(id = "username")
	private WebElement userNameTextFiled;
	
	@FindBy(id = "email")
	private WebElement emailIdTextField;
	
	@FindBy(id = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(id = "comments")
	private WebElement comentTextAreaField;
	
	@FindBy(xpath = "//input[@id='male']")
	private WebElement maleGenderRadioBtn;
	
	@FindBy(xpath = "//input[@value='Reading']")
	private WebElement readungHobbiesCheckBox;
	
	@FindBy(xpath = "//input[@value='Sports']")
	private WebElement sportsHobbiesCheckBox;
	
	
	


	

	

	

	

	

	public SeleniumWebElementsPlaygroundPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserNameTextFiled() {
		return userNameTextFiled;
	}

	public void setUserNameTextFiled(WebElement userNameTestFiled) {
		this.userNameTextFiled = userNameTestFiled;
	}
	

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public void setEmailIdTextField(WebElement emailIdTextField) {
		this.emailIdTextField = emailIdTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	
	public WebElement getComentTextAreaField() {
		return comentTextAreaField;
	}

	public void setComentTextAreaField(WebElement comentTextAreaField) {
		this.comentTextAreaField = comentTextAreaField;
	}
	public WebElement getMaleGenderRadioBtn() {
		return maleGenderRadioBtn;
	}

	public void setMaleGenderRadioBtn(WebElement maleGenderRadioBtn) {
		this.maleGenderRadioBtn = maleGenderRadioBtn;
	}
	
	public WebElement getReadungHobbiesCheckBox() {
		return readungHobbiesCheckBox;
	}

	public void setReadungHobbiesCheckBox(WebElement readungHobbiesCheckBox) {
		this.readungHobbiesCheckBox = readungHobbiesCheckBox;
	}
	
	public WebElement getSportsHobbiesCheckBox() {
		return sportsHobbiesCheckBox;
	}

	public void setSportsHobbiesCheckBox(WebElement sportsHobbiesCheckBox) {
		this.sportsHobbiesCheckBox = sportsHobbiesCheckBox;
	}

}
