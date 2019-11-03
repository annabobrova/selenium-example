package com.anna.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.anna.base.Constants.*;

public class Base {

    protected WebDriver driver;

    protected void startBrowser(){
        //Point the system where ChromeDriver.exe is saved
        System.setProperty("selenium-chrome-driver", System.getProperty("user.dir"));
        // Initialize browser
        driver=new ChromeDriver();
        // Open Google
        driver.get(URL);
    }

    protected void goBack(){
        driver.navigate().back();
    }

    protected void close(){
        driver.close();
    }
}
