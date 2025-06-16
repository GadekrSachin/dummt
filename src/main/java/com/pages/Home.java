package com.pages;

import java.time.Duration;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.WebDriver;
import com.factory.Base_driver;

public class Home {
	WebDriver driver;

	Base_driver basedriver= new Base_driver();

	public Home(WebDriver driver) {
		this.driver = driver;

	}

	public void user_home() {

		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("data 101");
	}

	public void data () {

	}
}
