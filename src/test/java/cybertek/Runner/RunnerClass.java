package cybertek.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/bilalahmatjan/asdasdasdas/src/test/resources/features/About_Activity_Stream",
                  glue = "/Users/bilalahmatjan/asdasdasdas/src/test/java/cybertek/Step_difiniiton/Activity_Stream_definition.java",
                 dryRun = true)



public class RunnerClass {
}
