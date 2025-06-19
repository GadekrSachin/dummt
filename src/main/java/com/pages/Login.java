package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;

public class Login {

	WebDriver driver;
	Base_driver basedriver = new Base_driver();


	public Login(WebDriver driver) {
		this.driver = driver;
	}

	private By username = By.xpath("//input[@name=\"username\"]");
	private By password = By.xpath("//input[@name=\"password\"]");
	private By auth_button = By.xpath("//button[@type=\"submit\"]");

	public void user_onhomepage(String username1, String password2) {
		System.out.println("first step");
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Base_driver.driver.findElement(username).sendKeys(username1);
		Base_driver.driver.findElement(password).sendKeys(password2);
		Base_driver.driver.findElement(auth_button).click();
		Common.takeScreenshot(Base_driver.driver, password2);
		System.out.println("second step");
	}

}
