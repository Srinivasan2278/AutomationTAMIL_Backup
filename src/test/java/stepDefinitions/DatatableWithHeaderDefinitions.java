package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatatableWithHeaderDefinitions {

	WebDriver driver;
	
	@Given("Login page of orange page websiteB")
	public void login_page_of_orange_page_website_b() throws InterruptedException {
		 driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(2000);
	}
	@When("userB enters the credentials")
	public void user_b_enters_the_credentials(DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
			List<Map<String, String>> Keyvaluepair = dataTable.asMaps(String.class, String.class);
		String user  =	Keyvaluepair.get(0).get("Username");
		String	pass = Keyvaluepair.get(0).get("Password");
	    
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(user);
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys(pass);
	    
	}
	@When("userB clicks the login page button")
	public void user_b_clicks_the_login_page_button() throws InterruptedException {
		Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   System.out.println("hello");
	}
	
}
