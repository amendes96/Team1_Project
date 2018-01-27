package testpageobject;
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
    //@Test(enabled = true)
    public void validateLogoTest(){
        boolean image = homePage.validateLogo();
        Assert.assertTrue(image);
    }
    @Test(enabled = true)
    public void searchItemsTest(){
        homePage.searchItems();
    }
    @Test(enabled = true)
    public void useSearchBtnTest(){
        homePage.useSearchBtn();
    }
    //@Test(enabled = true)
    public void verifyCurrentUrlTest(){
        String currentUrl = homePage.verifyCurrentUrl();
        Assert.assertTrue(verifyCurrentUrl().contains(currentUrl));
        System.out.println(currentUrl);
    }
   // @Test(enabled = true)
    public void verifyPageTitleTest(){
        String title = homePage.verifyPageTitle();
        Assert.assertTrue(verifyPageTitle().contains(title));
        System.out.println(title);
    }
    //@Test(enabled = true)
    public void isStoreLocatorDisplayedTest(){
        boolean yes = homePage.isStoreLocatorDisplayed();
        Assert.assertEquals(yes,true,"Store Locator not Displayed");
    }
    //@Test(enabled = true)
    public void isProfileMenuEnableTest(){
        boolean enable = homePage.isProfileMenuEnable();
        Assert.assertEquals(enable, true);
    }
    @Test(enabled = true)
    public void verifyWeeklyAddLink(){
        homePage.clickOnWeeklyAddLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://deals.bestbuy.com/?category=featured+deals");
    }
    @Test(enabled = true)
    public  void VerifyDealOfTheDayLink(){
        homePage.clickOnDealOfTheDayLink();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Deal of the Day: Electronics Deals - Best Buy", "Deal of the Day Page Title not matched");
    }

}
