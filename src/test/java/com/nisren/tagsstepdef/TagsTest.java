package com.nisren.tagsstepdef;

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

        /**
         *   @Important
         *   Feature: Create Account Of FFaceBook
         *   As a User u need to open facebook home page and do the validations
        */
//        tags = {"@Important"}, // This means all the scenarios will be executed if the tag is on feature file eg above
//        tags = {"@Smoke"},       // Scenarios which are used with   @Smoke Tag will only be executed
//        tags = {"@Smoke","@Regression"}, //And this executes scenarios which are tagged with both these tags
        tags = {"@Smoke,@Regression"},  //Or condition if dono me se ek bhi tag hua on scenario
                                        // then also execute the test
        //Feature File ka path
        // features = {"src/test/resource/com/nisren/firstfeatturefilehw/", "src/test/java/com/nisren/firstfeatturefile"},
        features = {"src/test/resources/com/nisren/tagsfeaturefile/"},

        //StepDefination File ka path
        //  glue = {"com/nisren/firsefeatturefile/", "com/nisren/otherlocation"},
        glue = {"com/nisren/tagsstepdef/"},
        plugin = {"pretty",
                         "html:target/cucumber-htmlreport",
                        "json:target/cucumber-report.json",
                        "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
        }
)
public class TagsTest {

}
