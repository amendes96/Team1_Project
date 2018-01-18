package home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ValidSignIn extends CommonAPI{

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(xpath = ".//*[@id='id-already-subscribed']/a/span")//span[@class='copy']
    WebElement ads;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;

    public void login() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.click();
        ads.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
        Thread.sleep(2000);
    }
}