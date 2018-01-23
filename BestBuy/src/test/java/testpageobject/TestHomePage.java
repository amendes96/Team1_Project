package testpageobject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestHomePage extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void initializePageFactory(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(enabled = false)
    public void validateLogoTest(){
        boolean image = homePage.validateLogo();
        Assert.assertTrue(image);
    }
    @Test(enabled = false)
    public void searchItemsTest(){
        homePage.searchItems();
    }
    @Test(enabled = false)
    public void useSearchBtnTest(){
        homePage.useSearchBtn();
    }
    @Test(enabled = false)
    public void verifyCurrentUrlTest(){
        String currentUrl = homePage.verifyCurrentUrl();
        Assert.assertTrue(verifyCurrentUrl().contains(currentUrl));
        System.out.println(currentUrl);
    }
    @Test(enabled = false)
    public void verifyPageTitleTest(){
        String title = homePage.verifyPageTitle();
        Assert.assertTrue(verifyPageTitle().contains(title));
        System.out.println(title);
    }
    @Test(enabled = false)
    public void isStoreLocatorDisplayedTest(){
        boolean yes = homePage.isStoreLocatorDisplayed();
        Assert.assertTrue(yes);
    }
}
