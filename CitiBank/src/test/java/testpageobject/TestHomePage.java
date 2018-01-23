package testpageobject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageobject.HomePage;
import pageobject.OpenAccount;
import pageobject.SignOnHelp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI{

    @Test
    public void homePageTitleTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        String title = homePage.validateHomePageTitle();
        Assert.assertEquals(title, "Banking with Citi");
    }

//    //@Test(enabled = true)
//    public void openAccountTest() throws InterruptedException {
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.openAccount();
//        OpenAccount openAccount = PageFactory.initElements(driver, OpenAccount.class);
//        openAccount.selectRegion();
//    }
//    @Test(enabled = false)
//    public void clickEspanolTest(){
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.clickEspanol();
//    }
//    @Test(enabled = false)
//    public void recoverUserIDTest(){
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.recoverUserID();
//
//    }
//    @Test(enabled = false)
//    public void clickForgotPasswordTest(){
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.clickForgotPassword();
//    }
//    @Test(enabled = false)
//    public void activateCardTest(){
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.activateCard();
//    }
//    @Test(enabled = false)
//    public void signOnHelpTest(){
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.recoverUserID();
//        SignOnHelp signOnHelp = PageFactory.initElements(driver, SignOnHelp.class);
//        signOnHelp.useRadioButton();
//    }
}
