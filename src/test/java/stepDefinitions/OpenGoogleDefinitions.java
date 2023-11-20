package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	 WebDriver driver;
	
	@Given("user is entering  google.co.in")
	public void user_is_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String searchterm) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("q")).sendKeys(searchterm);
	}
	@When("enter the ENTER key")
	public void enter_the_enter_key() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("user should see the searchh results")
	public void user_should_see_the_searchh_results() {
	    // Write code here that turns the phrase above into concrete actions
	    boolean status= driver.findElement(By.partialLinkText("tamil")).isDisplayed();
	    if (status) {
			System.out.println("the result is displayed");
		}
	}

}
