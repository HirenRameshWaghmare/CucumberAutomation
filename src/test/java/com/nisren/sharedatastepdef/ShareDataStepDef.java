package com.nisren.sharedatastepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShareDataStepDef {
    WebDriver driver;

    public ShareDataStepDef(SharedClass sharedClass){
        driver = sharedClass.setup();
    }


//    /**
//     * This before will execute first
//     * 1 then 2
//     * but after behaves opposite
//     */
//    @Before
//    public void beforeSetup(){
//        System.out.println("In Before Call");
//        //Adding driver name"webdriver.chrome.driver" and the path
//        System.setProperty("webdriver.chrome.driver","H:\\Users\\waghm\\OneDrive\\Documents\\Selenium Automation Browser\\chromedriver.exe");
//
//        //Assign the Chrome Driver
//        driver = new ChromeDriver();
//    }

    @Given("^User need to be on facebook login page$")
    public void userNeedToBeOnFacebookLoginPage() {
//        //Adding driver name"webdriver.chrome.driver" and the path
//        System.setProperty("webdriver.chrome.driver","H:\\Users\\waghm\\OneDrive\\Documents\\Selenium Automation Browser\\chromedriver.exe");
//
//        //Assign the Chrome Driver
//        driver = new ChromeDriver();

        //Adding the URL of facebook login page for signup
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    }

    @When("^User enters user \"([^\"]*)\" First Name$")
    public void userEntersUserFirstName(String firstName) throws InterruptedException {
        //Facebook ke account creation ke form ke First Name Field ko inspect karke got the xpath value
        driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(firstName);
        Thread.sleep(1000);


    }



//    /**
//     * In after it behaves the opp of before means
//     * order 2 will execute first then order 1
//     * B-1, B-2, A-2, and then A-1
//     */
//    @After
//    public void tearDown(){
//        System.out.println("In After Call");
//        driver.quit();
//        driver = null;
//    }

}
