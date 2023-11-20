package fileProperties_Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 *  when you send your program for the customer , he may run the browser in different browser .
 *  so in that case you have to prepare the program so that the customer can run the program  in different browser.
 */

public class FileProperties {
			 
	   WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = null;
		
		FileInputStream stream = new FileInputStream("./Output/config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		String browser= properties.getProperty("browser"); // NOTE - <browser> is case sensitive.
		String driverlocation= properties.getProperty("DriverLocation");
		 
		if (browser.equalsIgnoreCase("chrome")) {    // equalsIgnoreCase is given where it ignores case sensitive in a word.
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver = new FirefoxDriver();
		}
		
		 driver.get("https://www.google.co.in/"); 
		
	}

}

