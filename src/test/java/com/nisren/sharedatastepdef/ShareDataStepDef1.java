package com.nisren.sharedatastepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShareDataStepDef1 {
    WebDriver driver ;

    public ShareDataStepDef1(SharedClass sharedClass){
        driver = sharedClass.setup();
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

//    @Then("^close browser$")
//    public void closeBrowser(){
//
//
//        driver.quit();
//        driver = null;
//
//    }

}
