package stepDefinitions;

import io.cucumber.java.en.Given;

public class RegularExpressionDefinition {

	@Given("i have {int} laptop")
	public void i_have_laptop(Integer int1) {
	   System.out.println("Laptop count is "+ int1);
	}
	@Given("i have {double} CGPA")
	public void i_have_cgpa(Double cgpa) {
	  System.out.println("CGPA is "+cgpa);
	}
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String name1, String name2, String name3) {
	  System.out.println(name1+" is elder to "+ name2+" and "+ name3);
	}   

	
}
