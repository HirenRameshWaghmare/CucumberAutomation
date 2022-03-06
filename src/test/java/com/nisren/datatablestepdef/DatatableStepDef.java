package com.nisren.datatablestepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatatableStepDef {
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

    @When("^User enters user \"([^\"]*)\" First Name$")
    public void userEntersUserFirstName(String firstName) throws InterruptedException {
        //Facebook ke account creation ke form ke First Name Field ko inspect karke got the xpath value
        driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(firstName);
        Thread.sleep(1000);


    }

    @Then("^User checks User \"([^\"]*)\" First Name is present$")
    public void userChecksUserFirstNameIsPresent(String firstName) throws InterruptedException {
        //Checking ki USername Hiren hi ya kuch aur
        //Means this check username field me kya value he aur wo value then we put in userNameActual field se leke
        // to check in the assert method
        String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
        //Assert JUnit ka likha
        Assert.assertEquals(firstName,userNameActual);
        Thread.sleep(1000);
    }

    @And("^User enters \"([^\"]*)\" Sur name$")
    public void userEntersUserSurName(String surname) throws InterruptedException {
        //Facebook ke account creation ke form ke First Name Field ko inspect karke got the xpath value
        driver.findElement(By.xpath("//input[@id='u_1_d_bc']")).sendKeys(surname);
        Thread.sleep(1000);


    }

    @But("^User mobile field should be blank$")
    public void userMobileFieldShouldBeBlank() throws InterruptedException {
        //Means this check surname field me kya value he aur wo value then we put in userSurNameActual me
        // to check in the assert method
        String userSurNameActual = driver.findElement(By.xpath("//input[@id='u_1_g_hx']")).getAttribute("value");
        //Assert JUnit ka likha
        Assert.assertEquals(" ",userSurNameActual);
        Thread.sleep(1000);


    }

    @Then("^close browser$")
    public void closeBrowser(){


        driver.quit();
        driver = null;

    }

    @When("^Enter Following Data$")
    public void enterFollowingData(DataTable table) throws InterruptedException {
        List<List<String>> data  = table.raw();
        //1st get is row no and second get is column number, eg row 0 column 0, row 1 column 1 , row 2 column 2.
        //Ye title ka values
        String values1 = data.get(0).get(0);
        String values2 = data.get(0).get(1);
        String values3 = data.get(0).get(2);

        //Title row ke niche ka value
        String values4 = data.get(1).get(0);
        String values5 = data.get(1).get(1);
        String values6 = data.get(1).get(2);

//        driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(values4);
//        driver.findElement(By.xpath("//input[@id='u_1_d_bc']")).sendKeys(surname);
        driver.findElement(By.xpath("//input[@id='u_1_d_bc']")).sendKeys(values5);
        Thread.sleep(2000);





    }
}
