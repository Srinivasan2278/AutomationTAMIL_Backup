package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedHooksDefinitions {

	
	@Given("Thor as a hammer")
	public void thor_as_a_hammer() {
	  System.out.println("THOR - A");
	}
	@When("Thor unlocks the hammer")
	public void thor_unlocks_the_hammer() {
		System.out.println("THOR - B");  
	}
	@When("Thor becomes god of lightning")
	public void thor_becomes_god_of_lightning() {
		System.out.println("THOR - C");
	}
	
	@Given("Loki as a scepter")
	public void loki_as_a_scepter() {
		System.out.println("LOKI - A");
	}
	@When("Loki unlocks scepter")
	public void loki_unlocks_scepter() {
		System.out.println("LOKI - B");
	}
	@When("Loki becomes god of mischief")
	public void loki_becomes_god_of_mischief() {
		System.out.println("LOKI - C");
	}
}
