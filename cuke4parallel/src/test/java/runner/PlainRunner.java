package runner;

import cucumber.api.cli.Main;

public class PlainRunner {
	public static void main(String[] args) {
		Main.main(new String[]{"--threads", "4","-p","timeline:target/cucumber-parallel-report", "-g", "stepdef", "src/test/resources/features/parallel/"});
	}
}
