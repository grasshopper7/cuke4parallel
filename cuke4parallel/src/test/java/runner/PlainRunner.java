package runner;

import cucumber.api.cli.Main;

public class PlainRunner {
	public static void main(String[] args) {
		String[] params = new String[] { "-p", "timeline:target/cucumber-parallel-report", "-g",
				"stepdef", "src/test/resources/features/parallel/", "--threads", "4" };
		Main.run(params, Thread.currentThread().getContextClassLoader());
	}
}
