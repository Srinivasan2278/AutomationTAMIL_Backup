package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendingDataDatatableDefinitions {

	WebDriver driver;
	
	@Given("Login page of orange page websiteC")
	public void login_page_of_orange_page_website_c() throws InterruptedException {
		 driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(2000);
	}
	@When("userC enters the credentials {string} and {string}")
	public void user_c_enters_the_credentials_and(String Username,String Password) throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(Username);
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys(Password);
	}
	@When("userC clicks the login page button")
	public void user_c_clicks_the_login_page_button() throws InterruptedException {
		Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
	} 
	
}
