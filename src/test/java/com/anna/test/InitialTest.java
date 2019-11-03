package com.anna.test;

import com.anna.base.Base;
import com.anna.base.FrontPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertArrayEquals;
import static org.testng.AssertJUnit.assertEquals;


public  class InitialTest extends Base {
    private FrontPage frontPage;

    @BeforeTest
    public void startUp(){
        startBrowser();
        frontPage = new FrontPage(driver);
    }

    @AfterTest
    public void tearDown(){
        close();
    }

    /**
     *
     * This test verifies
     * 1.Contacts Oracle Department opens "Inbox" pop up
     * 2. Quit button closes the pop-up
     */
    @Test(priority = 1)
    public void verifyContactIconOnToolBar(){
        //click on the Contact Info button on the toolbar
        String[] infoFromFrontPage = frontPage.verifyContactOnToolBar();
        String[] expectedInfo= {"Call Oracle\n" +
                "1-800-633-0643 (US)", "Submit a Product Inquiry", "Have Oracle Call You", "Global Contacts", "Find a Partner",
                "Support Directory"};

        //Compare displayed  info on the web with the expected one
        assertArrayEquals( expectedInfo, infoFromFrontPage);

        //close the information popup
        frontPage.closeContactOnToolBar();


    }
    /**
    Verify that Social button opens the pop up.
    This pop up has two hyperlinks.
    Check that both links works and bring you to the right page
     */
    @Test(priority = 2)
    public void verifySocialOnToolBar() throws InterruptedException {
        //click on the Social button on the toolbar
        frontPage.openSocialOnToolBar();

        //click on the "Oracle Social Media Directory" hyperlink
        assertEquals( frontPage.verifyOracleSocialMediaLink(), "https://twitter.com/oracle");

        goBack();


    }
}

