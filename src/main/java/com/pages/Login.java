package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_driver;

public class Login {

	WebDriver driver;
	Base_driver basedriver = new Base_driver();
	Properties prop= config.getproperty();

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	private By username = By.xpath("//input[@formcontrolname=\"username\"]");
	private By password = By.xpath("//input[@formcontrolname=\"password\"]");
	private By auth_button = By.xpath("//button[@class=\"btn text-uppercase loginbtn fw-700\"]");

	private By Error_msg = By.xpath("//div[contains(text(),\"Invalid username or password\") ]");

	public void user_onhomepage(String username1, String password2) {

		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Base_driver.driver.findElement(username).sendKeys(username1);
		Base_driver.driver.findElement(password).sendKeys(password2);
		Base_driver.driver.findElement(auth_button).click();

	}

	public void user_loginwith_invalid(String username1, String password2) throws InterruptedException {
		Base_driver.driver.findElement(username).sendKeys(username1);
		Base_driver.driver.findElement(password).sendKeys(password2);
		System.out.println("step1");
		Base_driver.driver.findElement(auth_button).click();

		System.out.println("step2");
		String error_messageString = Base_driver.driver.findElement(Error_msg).getText();
		Thread.sleep(4000);
		System.out.println("error_messageString:"+error_messageString);
//		Assert.assertEquals(error_messageString, prop.getProperty("error_messageString"));
	}

}
