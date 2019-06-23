package runner;

import cucumber.api.cli.Main;

public class PlainRunner {
	
	public static void main(String[] args) {
		String[] params = new String[] { 
				"--threads", "4", "-g", "stepdef",
				"-p", "timeline:target/cucumber-parallel-report", 
				"src/test/resources/features/parallel/", };
		Main.run(params, Thread.currentThread().getContextClassLoader());
	}
}
