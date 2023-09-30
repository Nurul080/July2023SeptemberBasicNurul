package com.facebook.pageObjectModel_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;// instance variable

	/**
	 * @param driver user define constructor for POM
	 */
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);// this line is design for POM
	}

	public WebElement userName(String enterYourUserName) {
		WebElement uName = driver.findElement(By.cssSelector("#email"));
		uName.clear();
		uName.sendKeys(enterYourUserName);
		System.out.println("what is the tag name" + uName.getTagName());
		return uName;

	}

	public WebElement Passwrod(String enterYourPassowrod) {
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.clear();
		pass.sendKeys(enterYourPassowrod);
		return pass;

	}

	public void clickloginButton() {
		// driver.findElement(By.name("login")).click();
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

	}

	public WebElement forgetPassword() {
		WebElement forgetpass = driver.findElement(By.linkText("Forgot password?"));
		forgetpass.click();
		return forgetpass;

	}

	public WebElement createNewAccount() {
		WebElement newAccount = driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		return newAccount;
	}

}
