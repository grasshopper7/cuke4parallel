package runner;

import org.junit.Test;

import cucumber.api.cli.Main;

public class JunitParallel {

	@Test
	public void test() {
		String[] params = new String[] { "-p", "timeline:target/cucumber-parallel-report", "-g",
				"stepdef", "src/test/resources/features/parallel/", "--threads", "4" };
		Main.run(params, Thread.currentThread().getContextClassLoader());
	}
}