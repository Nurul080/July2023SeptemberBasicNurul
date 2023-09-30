package com.facebook.pageFactory;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

	}
	@Test
	public void validLoginTest() {
		driver.findElement(By.id("email")).sendKeys("uuu");
		driver.findElement(By.id("pass")).sendKeys("rrr");
	}
	
	@Test
	public void inValidLoginTest() {
		driver.findElement(By.id(null)).sendKeys("");
		driver.findElement(By.id(null)).sendKeys("");
		driver.
	}

}


	
	



