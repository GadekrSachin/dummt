package Hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;
import com.pages.config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {

	  WebDriver driver;
	Base_driver basedriver= new Base_driver();

	Properties pro = config.getproperty();





	@Before
	 public void launch_browser() {
		 basedriver.initializationDriver(pro.getProperty("browser"));
		 Base_driver. driver.get(pro.getProperty("weburl"));
		 Base_driver. driver.manage().window().maximize();
	 }

	@After
	public void close() {
		Base_driver.driver.close();
	}


}
