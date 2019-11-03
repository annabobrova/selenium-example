package com.anna.base;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.anna.base.FrontPageObjects.*;

public class FrontPage {
    private WebDriver driver;

    public FrontPage(WebDriver driver) {
        this.driver = driver;
    }

    public String clickOnContactOracleDepartment(){
        try{
            driver.findElement(contactOracleDepartmentButton).click();
            return driver.findElement(contactInfo).getText();

        }
        catch (NoSuchElementException e){
            return "There is an issue to find an element";
        }
    }
    /** open Contact info popup */
    public String[] verifyContactOnToolBar() {
        String[] listOfInfo = new String[6];
        //click on the Contact Info button (Phone) on the toolbar
        driver.findElement(contactToolBarIcon).click();
        //get text from displayed information in put it in the array
        List<WebElement> listofItems = driver.findElements(contactInfo);

        int j = 0;
        for (WebElement webElement : listofItems) {
            listOfInfo[j++] = webElement.getText();
            //System.out.println(j+"="+listOfInfo[j]);
        }
        return listOfInfo;
    }

        //close Contact info popup
    public void closeContactOnToolBar(){
        driver.findElement(contactToolBarIcon).click();
    }

        //open Social info from the toolbar
    public void openSocialOnToolBar(){
        driver.findElement(socialButton).click();
    }

    //verify "Oracle Social Media Directory" hyperlink
    public String verifyOracleSocialMediaLink() throws InterruptedException {
        driver.findElement(oracleSociailMediaLink).click();

        //verify that hyper link brings on the new page
        Thread.sleep(3000);
        return driver.getCurrentUrl();

    }

}
