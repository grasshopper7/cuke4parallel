Refer to this article - https://ghchirp.online/283/

Cucumber-JVM 4 supports parallel execution across threads out of the box. This article describes how to run features directly from Java code inside a main method, from the CLI, JUnit test method or TestNG test method. This makes use of the run() method of the Main class contained in the cucumber.api.cli package. The run() method executes the feature files directly without the use of a runner. The options that need to be passed as a String[] to the run() method are described here.

To run Cucumber in parallel using JUnit4 refer to this https://ghchirp.tech/464/ or with TestNG refer to this https://ghchirp.tech/466/.
