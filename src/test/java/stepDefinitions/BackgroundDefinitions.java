package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BackgroundDefinitions {
	
	
	
	@Given("the student should completed higher secondary education.")      // Background
	public void the_student_should_completed_higher_secondary_education() {
	   System.out.println("this is background condition");
	}
	@Given("the student should have more than {int}% marks.")               // Background
	public void the_student_should_have_more_than_marks(Integer int1) {
		System.out.println("this is background condition"); 
	}

	@Given("the student applied for engineering course")
	public void the_student_applied_for_engineering_course() {
	    System.out.println("A-1");
	}
	@When("the student passed engineering entrance exam")
	public void the_student_passed_engineering_entrance_exam() {
		System.out.println("A-2");

	}
	@When("the student is eligible for engineering course")
	public void the_student_is_eligible_for_engineering_course() {
		System.out.println("A-3");

	}

	
	@Given("the student applied for medical course")
	public void the_student_applied_for_medical_course() {
		System.out.println("B-1");

	}
	@When("the student passed medical entrance exam")
	public void the_student_passed_medical_entrance_exam() {
		System.out.println("B-2");

	}
	@When("the student is eligible for medical course")
	public void the_student_is_eligible_for_medical_course() {
		System.out.println("B-3");
    
	
		
	}
}
