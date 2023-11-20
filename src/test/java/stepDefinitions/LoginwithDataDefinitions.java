package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// In this program we will get username and password directly from feature file. rather than giving it directly to the stepdefintions class.


public class LoginwithDataDefinitions {
	
      WebDriver driver ;
      
	@Given("Login page of orange page website")
	public void login_page_of_orange_page_website() throws InterruptedException {
		 driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(2000);
	}
	
	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(username);
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("user clicks the login page button")
	public void user_clicks_the_login_page_button() throws InterruptedException {
		Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   	}
	
	@Then("user logged in to the orange page webpage")
	public void user_logged_in_to_the_orange_page_webpage() throws InterruptedException {
		Thread.sleep(2000);
	    boolean status=  driver.findElement(By.xpath("//span[(text()='Admin')]")).isDisplayed();
	  
	    //  Assert.assertTrue(status);
	    
	    if (status) {
			System.out.println("yes we have successfully Logged IN");
		}
	}
	
}
