package pointr_maps.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(//to create plugin
        //These that we want things before run
        plugin="html:reports/CucumberReport.html",
        features = "src/test/resources/features",
        glue = {"pointr_maps/stepdefs", "pointr_maps/hooks"},
        tags = "@search",
        dryRun = false ,//If We do ture, we can create empty stepdefs
        monochrome = true
)

public class Runner {


}
