package stepdef;

import org.openqa.selenium.WebDriver;
import com.factory.Base_driver;
import com.pages.Login;
import io.cucumber.java.en.Given;

public class Login_StepDef {
	WebDriver driver;
	Base_driver base = new Base_driver();
	Login login = new Login(Base_driver.getdriver());

	@Given("user on home page using valid {string} and {string}")
	public void user_on_home_page_using_valid_and(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		login.user_onhomepage(username, password);
		Thread.sleep(3000);
	}

	@Given("getting error using Invalid {string} and {string}")
	public void getting_error_using_invalid_and(String username, String password) throws InterruptedException {
		login.user_loginwith_invalid(username, password);
	}

}
