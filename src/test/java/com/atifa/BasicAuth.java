package com.atifa;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuth {

    /*
    * Go to homepage
    * click on basic auth
    * enter basic auth username and password
    * validate successful basic auth
    * close the browser
    * */
    @Test
    public void signInBasicAuthSuccessfully(){
        WebDriver driver= Base.openHomePage();
        driver.findElement(By.linkText("Basic Auth")).click();

        String urlWithAuthCredential="https://admin:admin@the-internet.herokuapp.com/basic_auth";
        driver.get(urlWithAuthCredential);

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Congratulations! You must have the proper credentials.");

        Base.closeCurrentBrowser();



    }
}
