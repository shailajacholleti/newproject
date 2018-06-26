package com.selenium.training;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private String browser = " ";
    public static WebDriver driver;


    public void openBrowser(){
        switch (browser){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "opera":
                driver = new OperaDriver();
                break;
        }
    }

    public void closeWindow(){driver.quit();}
    public void maxWindow(){driver.manage().window().maximize();}
    public void applyImpWait(){driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
    public void navigate(String url){driver.get(url);}
    public void sleep(int ms){
        try{
            Thread.sleep(ms);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void selectFilter(String filterValue){

    }

}
