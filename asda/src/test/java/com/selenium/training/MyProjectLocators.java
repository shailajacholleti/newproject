package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyProjectLocators extends DriverFactory {

    public void doSearch(String product){
        driver.findElement(By.id("search")).sendKeys(product);
        driver.findElement(By.cssSelector("header-asda_search-button"));
        sleep(3000);

    }
    public void selectFilters(String filterValue){
        List<WebElement> allFilters = driver.findElements(By.cssSelector(".active.tab>a>span)"));
        for (WebElement filter: allFilters){
            if(filter.getText().equalsIgnoreCase(filterValue));
            filter.click();
            break;

        }
        sleep(5000);

    }



}
