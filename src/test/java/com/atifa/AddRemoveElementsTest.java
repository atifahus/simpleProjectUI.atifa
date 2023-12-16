package com.atifa;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest {
    /*
     * go to heroku app homepage
     * validate user is homepage
     * click on add/remove elements
     * validate user is add/remove elements page
     * click on add element button
     * validate delete button shows up
     * click on delete button
     * validate delete button doesn't show up
     * close the browser
     * */
@Test
    public void ValidateAddElement() {

        WebDriver driver= Base.openHomePage();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(),"Welcome to the-internet");

        driver.findElement(By.linkText("Add/Remove Elements")).click();
        Assert.assertEquals(driver.findElement(By.tagName("button")).getText(),"Add Element");

        driver.findElement(By.xpath("//div[@id='content']/div/button")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']/div/div/button")).getText(),"Delete");

        driver.findElement(By.xpath("//div[@id='content']/div/div/button")).click();


    //   Assert.assertNotEquals(driver.findElement(By.xpath("//div[@id='content']/div/div/button")).getText(),"Delete");

     // Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']/div/div/button")).isDisplayed(),false);

        Base.closeCurrentBrowser();


    }

}
