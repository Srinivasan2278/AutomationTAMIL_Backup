package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ThanosHooks1Definitions {



		@Given("Thanos has infinity stones")
		public void thanos_has_infinity_stones() {
			System.out.println("thanos has infinity stones");
		}
		@When("Thanos snaps is finger")
		public void thanos_snaps_is_finger() {
			System.out.println("thanos snaps is finger");
		}
		@When("Half population in universe disappeared")
		public void half_population_in_universe_disappeared() {
			System.out.println("half population in universe disappeared");	
		}

	
}
