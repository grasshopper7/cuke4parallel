package runner;

import org.junit.Test;

import cucumber.api.cli.Main;

public class JunitParallel {

	@Test
	public void test() {
		Main.main(new String[]{"--threads", "4","-p","timeline:target/cucumber-parallel-report", "-g", "stepdef", "src/test/resources/features/parallel/"});
	}
}