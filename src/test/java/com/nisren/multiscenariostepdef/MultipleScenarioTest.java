package com.nisren.multiscenariostepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Used to remove juk characters, by default it is false
        monochrome = true,

//        //This check the code is syntactically correct or not
//        dryRun = true,
//        //by default its false
//        //   dryRun = false,

        //Feature File ka path 
        // features = {"src/test/resource/com/nisren/firstfeatturefilehw/", "src/test/java/com/nisren/firstfeatturefile"},
        features = {"src/test/resources/com/nisren/multiscenariofeaturefile/"},

        //StepDefination File ka path
        //  glue = {"com/nisren/firsefeatturefile/", "com/nisren/otherlocation"},
        glue = {"com/nisren/multiscenariostepdef/"},
        plugin = {"pretty",
                  "html:target/cucumber-htmlreport",
                "json:target/cucumber-report7.json",
        }
)
public class MultipleScenarioTest {

}
