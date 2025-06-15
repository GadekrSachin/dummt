package stepdef;

import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;
import com.pages.Home;

import io.cucumber.java.en.Given;

public class home_stepdef {
	WebDriver driver;
	Base_driver base = new Base_driver( );
	Home h = new Home(Base_driver.getdriver());

	@Given("user on home page")
	public void user_on_home_page() {
		h.user_home();

	}

}
