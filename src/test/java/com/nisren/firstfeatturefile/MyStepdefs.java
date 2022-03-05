package com.nisren.firstfeatturefile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;

    @Given("^User need to be on facebook login page$")
    public void userNeedToBeOnFacebookLoginPage() {
        //Adding driver name"webdriver.chrome.driver" and the path
        System.setProperty("webdriver.chrome.driver","H:\\Users\\waghm\\OneDrive\\Documents\\Selenium Automation Browser\\chromedriver.exe");

        //Assign the Chrome Driver
        driver = new ChromeDriver();

        //Adding the URL of facebook login page for signup
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    }

    @When("^User enters user First Name$")
    public void userEntersUserFirstName() {
        //Facebook ke account creation ke form ke First Name Field ko inspect karke got the xpath value
        driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Hiren");
        
    }

    @Then("^User checks User First Name is present$")
    public void userChecksUserFirstNameIsPresent() {
        //Checking ki USername Hiren hi ya kuch aur
        String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
        //Assert JUnit ka likha
        Assert.assertEquals("Hiren",userNameActual);
    }
}
