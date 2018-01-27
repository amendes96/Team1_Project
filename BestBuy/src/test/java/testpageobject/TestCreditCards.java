package testpageobject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestCreditCards extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void initializePageFactory(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = true)
    public void verifyCreditCardsPageTitle(){
        homePage.clickOnCreditCardsLink();
        String ccPageTitle = driver.getTitle();
        Assert.assertEquals(ccPageTitle,"Best Buy Credit Card: Rewards & Financing");
    }
}
