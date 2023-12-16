package com.atifa;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown {
    /*
    * go to homepage
    * click on drop down option
    * select option1 from drop down menu
    * validate option1 is selected
    * close the browser
    * */
    @Test
    public void dropDownTest(){
        WebDriver driver= Base.openHomePage();
        driver.findElement(By.linkText("Dropdown")).click();
        Select select=new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue("1");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]")).isSelected(),true);
        Base.closeCurrentBrowser();

    }
}
