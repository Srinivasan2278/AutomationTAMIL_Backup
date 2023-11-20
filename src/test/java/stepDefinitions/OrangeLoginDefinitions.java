package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLoginDefinitions {
	
	WebDriver driver;
	
	@Given("Login page of orange website")
	public void login_page_of_orange_website() throws InterruptedException {
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	}
	
	
	@When("user enters the Username and Password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	
	@When("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Then("user logged in to the orange webpage")
	public void user_logged_in_to_the_orange_webpage() throws InterruptedException {
		Thread.sleep(2000);
	    boolean status=  driver.findElement(By.xpath("//span[(text()='Admin')]")).isDisplayed();
	  
	    //  Assert.assertTrue(status);
	    
	    if (status) {
			System.out.println("yes we have successfully Logged IN");
		}
	}

}
