package com.anna.base;
import org.openqa.selenium.By;

public class FrontPageObjects {

    public static final By contactOracleDepartmentButton = new By.ByXPath("//*[contains(text(), \"Contact Oracle Health Sciences\")]");
    public static final By contactToolBarIcon = new By.ByXPath("//a[@href='#cw21-helptab']");
    public static final By contactInfo= new By.ByXPath("//div[@id=\"cw21-helptab\"]//li");
    public static final By socialButton = new By.ByXPath("//a[@href='#cw21-socialtab']");
    public static final By oracleSociailMediaLink = new By.ByXPath("//*[contains(text(), \"Oracle Social Media Directory\")]");
    public static final By oracleSocailPage = new By.ByXPath("//div[@id='react-root']");


}
