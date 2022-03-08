package com.nisren.multiscemultifeatstepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoStepDef {
    WebDriver driver;
    @Given("^User need to be on demo site page$")
    public void userNeedToBeOnFacebookLoginPage() {
        //Adding driver name"webdriver.chrome.driver" and the path
        System.setProperty("webdriver.chrome.driver","H:\\Users\\waghm\\OneDrive\\Documents\\Selenium Automation Browser\\chromedriver.exe");
        //Assign the Chrome Driver
        driver = new ChromeDriver();
        //Adding the URL of facebook login page for signup
        driver.get("http://demo.automationtesting.in/Register.html");
    }

    @When("^User enters First Name$")
    public void userEntersSearchString() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Hiren");
        Thread.sleep(1000);
    }

    @When("^User enters Last Name$")
    public void userEntersLastName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("R Waghmare");
        Thread.sleep(1000);
    }
}
