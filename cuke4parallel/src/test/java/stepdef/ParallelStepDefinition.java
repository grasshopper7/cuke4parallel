package stepdef;

import cucumber.api.java.en.Given;

public class ParallelStepDefinition {

	@Given("the details from {word} are {int}")
	public void parallelstep(String file, int num) {
		System.out.println(Thread.currentThread().getId() + " - " + file + " - " +num);
	}
}
