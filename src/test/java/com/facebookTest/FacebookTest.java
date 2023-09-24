package com.facebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	WebDriver driver;
	
	
	@Test
	public void testOne() {
		System.out.println("hello testNg");
	}
	@Test
	public void openChromeBrowser () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void openEdgeBrowser() {
		driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.get("https://www.facebook.com/");
	}
	
}
