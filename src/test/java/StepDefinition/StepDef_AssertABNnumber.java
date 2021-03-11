package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_AssertABNnumber {
	public WebDriver driver;
	public BaseClass lp;
	
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new BaseClass(driver);
	}
	
	
	@Given("I Open the FreeView web {string}")
	public void i_open_the_free_view_web(String string) throws InterruptedException {		
		driver.get(string);
		Thread.sleep(3000);
	}


	@When("I navigate to WatchTV page from the Navigation bar")
	public void i_navigate_to_watch_tv_page_from_the_navigation_bar() throws InterruptedException {
		lp.clickWatchNavigationlink();
	}

	@When("Find and Click on Privacy Notice at bottom of the page")
	public void find_and_click_on_privacy_notice_at_bottom_of_the_page() throws InterruptedException  {
		lp.findPrivacyNotice();
	}

	@Then("I validate the ABN number with this {string}")
	public void i_validate_the_abn_number_with_this(String string) {
		String getABNno= lp.getABNnumtext();
		 String[] split=getABNno.split("ABN: ");
		 String abnno = split[1].substring(0, 14);
		 org.testng.Assert.assertEquals(string, abnno);
		 System.out.println("ABN is matching");
	}
}
