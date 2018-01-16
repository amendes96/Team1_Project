package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class YoutubeRed extends CommonAPI{

    @FindBy(id = "text")
    WebElement free;

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(xpath = ".//*[@id='id-already-subscribed']/a/span")
    WebElement ads;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;

    @FindBy(xpath = "//span[contains(.,'YouTube Red')]")
    WebElement youtubeRed;

    @FindBy(name = "cardnumber")
    WebElement crdtcardname;

    @FindBy(xpath = ".//*[@id='expand-arrow']")
    WebElement faqred;

    public void freeTrial()throws InterruptedException{
        signIn.click();
        //ads.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
        youtubeRed.click();
        free.click();
        Thread.sleep(3000);
        //crdtcardname.sendKeys("123456789", Keys.TAB);
    }
    public void faq() throws InterruptedException {
        signIn.click();
        //ads.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
        youtubeRed.click();
        faqred.click();
        Thread.sleep(3000);
    }
}