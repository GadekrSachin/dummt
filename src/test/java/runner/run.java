package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/Feature/Login.feature",
		glue = {"stepdef" ,"Hooks"},
		tags = "@login_with_invalid",
		plugin = {"pretty" , "html:testoutput/test-report"},
		monochrome = true

		)


public class run {
	public static void main(String[] args) {

	}

}
