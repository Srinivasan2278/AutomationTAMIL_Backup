package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks_Hooks {

	@Before("@first")
	public void beforescenarioT (){
		System.out.println("THOR - 1");
	}
	@After("@first")
	public void afterscenarioT (){
		System.out.println("THOR - 2");
	}
	@Before("@second")
	public void beforescenarioL (){
		System.out.println("LOKI - 1");
	}
	@After("@second")
	public void afterscenarioL (){
		System.out.println("LOKI - 2");
	}
}
