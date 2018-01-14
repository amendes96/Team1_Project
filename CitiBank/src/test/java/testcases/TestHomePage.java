package testcases;

import base.CommonAPI;
import home.HomePage;
import home.OpenAccount;
import home.SignOnHelp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI{

    //@Test(enabled = false)
    public void openAccountTest() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openAccount();
        OpenAccount openAccount = PageFactory.initElements(driver, OpenAccount.class);
        openAccount.selectRegion();
    }
    @Test(enabled = true)
    public void clickEspanolTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickEspanol();
    }

    //@Test(enabled = false)
    public void signInTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.signIn();
    }

    @Test(enabled = true)
    public void recoverUserIDTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.recoverUserID();

    }
    @Test(enabled = true)
    public void clickForgotPasswordTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickForgotPassword();
    }
    @Test(enabled = true)
    public void activateCardTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.activateCard();
    }
    @Test(enabled = true)
    public void signOnHelpTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.recoverUserID();
        SignOnHelp signOnHelp = PageFactory.initElements(driver, SignOnHelp.class);
        signOnHelp.useRadioButton();
    }
}
