package runner;

import org.testng.annotations.Test;

import cucumber.api.cli.Main;

public class TestNGParallel {
  @Test
  public void test() {
	  Main.main(new String[]{"--threads", "4","-p","timeline:target/cucumber-parallel-report","-g", "stepdef", "src/test/resources/features/parallel/"});
  }
}
