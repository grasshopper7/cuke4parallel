package stepdef;

import cucumber.api.java.en.Given;

public class ParallelStepDefinition {

	@Given("{string} step of scenario {string}")
	public void parallelScen(String step, String scen) {
		System.out.println("Thread ID " + Thread.currentThread().getId() + " runs '" + 
			step + " step' of '" + scen + "' from 'scenarios'.");
	}

	@Given("{string} step of {string} row of scenario outline")
	public void parallelScenOut(String step, String row) {
		System.out.println("Thread ID " + Thread.currentThread().getId() + " runs '" + 
			step + " step' of '" + row  + " example' from 'scenariooutlines'.");
	}
}
