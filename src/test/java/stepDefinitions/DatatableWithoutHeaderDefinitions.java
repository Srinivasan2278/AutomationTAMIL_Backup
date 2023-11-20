package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

// in this program we will see how pass data from feature file to an stepdefintion class using Datatable without Header.
public class DatatableWithoutHeaderDefinitions {
	
	WebDriver driver;

	@Given("Login page of orange page websiteA")
	public void login_page_of_orange_page_website_a() throws InterruptedException {
		 driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(2000);
	   
	  
	}
	
	@When("userA enters the credentials")
	public void user_a_enters_the_credentials(DataTable dataTable) throws InterruptedException {
		
		// important steps for this program
		
		     List<String> credentials = dataTable.asList(String.class);  // asList - (type)
		     String username = credentials.get(0);
		     String password = credentials.get(1);
		
		
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(username);
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys(password);
	 
	}
	
	@When("userA clicks the login page button")
	public void user_a_clicks_the_login_page_button() throws InterruptedException {
		Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   System.out.println("hello");
	
	}


	
}
