package com.facebook.pom_PageFectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPagrFactory {
	WebDriver driver;

	public LoginPageWithPagrFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="email") WebElement userNameId;
	public WebElement userNameMethod() {
		userNameId.sendKeys("mohit");
		return userNameId;
		
	}
	
	@FindBy (how=How.NAME, using="") WebElement passwordLocator;
	public WebElement passWordMethood(String enterYourPassword) {
		passwordLocator.sendKeys(enterYourPassword);
		return passwordLocator;
		
	}
	@FindBy(how=How.XPATH, using="") private WebElement loginButtonLocator;
	public void loginButton() {
		loginButtonLocator.click();
	}

	

}
