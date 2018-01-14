package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Open an Account')]")
    WebElement openAnAccount;
    @FindBy(xpath = "//a[@lang='es']")
    WebElement changeLanguage;

    public void openAccount() {
        openAnAccount.click();
    }
    public void clickEspanol(){
        changeLanguage.click();
    }

    @FindBy(id = "username")
    WebElement userIDInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "signInBtn")
    WebElement signOn;

    public void signIn() {
        userIDInput.sendKeys("xyx12");
        passwordInput.sendKeys("123xyz");
        signOn.click();
        String actual_error = driver.findElement(By.xpath(".//*[@id='cbolui-iconDomID-Red Error-iconText']")).getText();
        String expected_error = "Having trouble signing on? Please try again or to be reminded of your user ID or reset your password.";
        Assert.assertEquals(actual_error,expected_error);
    }

    @FindBy(id = "RequestUserIDReminder")
    WebElement forgotUserID;

    public void recoverUserID() {
        forgotUserID.click();
    }
    @FindBy(xpath = ("//a[contains(text(),'Forgot Password?')]"))
    WebElement forgotPassword;

    public void clickForgotPassword() {
        forgotPassword.click();
    }
    @FindBy(xpath = "//a[contains(text(), 'Activate a Card')]")
    WebElement activateCard;

    public void activateCard() {
        activateCard.click();
    }
    @FindBy(id = "creditCards")
    WebElement creditCardLink;
    public void clickCreditCard(){
        creditCardLink.click();
    }
}
