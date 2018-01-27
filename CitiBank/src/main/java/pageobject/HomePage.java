package pageobject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    //Page Factory -OR
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "signInBtn")
    WebElement signOn;
    @FindBy(xpath = "//div[contains(.,'Citi Bank Logo')]")
    WebElement logo;

    //Actions
    public String validateHomePageTitle() {
        return driver.getTitle();
    }
    public boolean validateLogo() {
        return logo.isDisplayed();
    }
    public LogInPage signIn(String un, String pw){
        username.sendKeys("abc");
        password.sendKeys("abc345");
        signOn.click();
        return new LogInPage();
    }

//    @FindBy(xpath = "//a[contains(text(),'Open an Account')]")
//    WebElement openAnAccount;
//    @FindBy(xpath = "//a[@lang='es']")
//    WebElement changeLanguage;
//
//    public void openAccount() {
//        openAnAccount.click();
//    }
//    public void clickEspanol(){
//        changeLanguage.click();
//    }

//    @FindBy(id = "RequestUserIDReminder")
//    WebElement forgotUserID;
//
//    public void recoverUserID() {
//        forgotUserID.click();
//    }
//    @FindBy(xpath = ("//a[contains(text(),'Forgot Password?')]"))
//    WebElement forgotPassword;
//
//    public void clickForgotPassword() {
//        forgotPassword.click();
//    }
//    @FindBy(xpath = "//a[contains(text(), 'Activate a Card')]")
//    WebElement activateCard;
//
//    public void activateCard() {
//        activateCard.click();
//    }
//    @FindBy(id = "creditCards")
//    WebElement creditCardLink;
//    public void clickCreditCard(){
//        creditCardLink.click();
//    }
}
