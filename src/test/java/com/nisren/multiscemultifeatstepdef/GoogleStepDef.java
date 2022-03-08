package com.nisren.multiscemultifeatstepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepDef {
    WebDriver driver;
    @Given("^User need to be on facebook login page$")
    public void userNeedToBeOnFacebookLoginPage() {
        //Adding driver name"webdriver.chrome.driver" and the path
        System.setProperty("webdriver.chrome.driver","H:\\Users\\waghm\\OneDrive\\Documents\\Selenium Automation Browser\\chromedriver.exe");

        //Assign the Chrome Driver
        driver = new ChromeDriver();

        //Adding the URL of facebook login page for signup
        driver.get("https://www.google.com");
    }


    @When("^User enters search string$")
    public void userEntersSearchString() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='rso']")).sendKeys("Hiren R Waghmare");
        Thread.sleep(1000);
    }
}
