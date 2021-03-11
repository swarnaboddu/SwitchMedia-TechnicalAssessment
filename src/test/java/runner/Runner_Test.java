package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
        glue={"StepDefinition"},stepNotifications = true, 
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" })     
public class Runner_Test{

}


 