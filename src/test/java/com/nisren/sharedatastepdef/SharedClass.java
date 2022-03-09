package com.nisren.sharedatastepdef;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedClass {

    WebDriver driver;

    @Before
    public WebDriver setup(){
        if (driver == null){

            System.out.println("In Before Call");
            //Adding driver name"webdriver.chrome.driver" and the path
            System.setProperty("webdriver.chrome.driver","H:\\Users\\waghm\\OneDrive\\Documents\\Selenium Automation Browser\\chromedriver.exe");

            //Assign the Chrome Driver
            driver = new ChromeDriver();
        }
        return driver;
    }

    @After
    public void tearDown(){
        driver.quit();
        driver=null;
    }
}
