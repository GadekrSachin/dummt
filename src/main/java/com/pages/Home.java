package com.pages;

import java.time.Duration;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.factory.Base_driver;

public class Home {
	WebDriver driver;

	Base_driver basedriver= new Base_driver();

	private By search_bar= By.xpath("//textarea[@class=\"gLFyf\"]");

	public Home(WebDriver driver) {
		this.driver = driver;

	}

	public void user_home() {

		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Base_driver.driver.findElement(search_bar).sendKeys("Test@123");


	}

	public void data () {

	}
}
