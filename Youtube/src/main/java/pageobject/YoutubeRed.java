package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class YoutubeRed extends CommonAPI {

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

    @FindBy(xpath = "//a[contains(.,'family membership')]")
    WebElement family;

    @FindBy(xpath = "//yt-formatted-string[contains(.,'Try it free')]")
    WebElement familyfree;

    @FindBy(xpath = "//a[contains(@href,'overview&hl=en')]")
    WebElement learnmore;

    @FindBy(xpath = "//a[contains(.,'Restrictions apply. Learn more here.')]")
    WebElement restr;

    @FindBy(xpath = "//a[@id='id-already-subscribed']")
    WebElement moreads;

    public void freeTrial() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubeRed.click();
        free.click();
        Thread.sleep(3000);
        //crdtcardname.sendKeys("123456789", Keys.TAB);
    }

    public void faq() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubeRed.click();
        faqred.click();
        Thread.sleep(3000);
    }
    public void familyMembership() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubeRed.click();
        family.click();
        Thread.sleep(3000);
        learnmore.click();
        driver.switchTo().defaultContent();
        familyfree.click();
    }
    public void restrictions() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().refresh();
        youtubeRed.click();
        restr.click();
        Thread.sleep(3000);
//        Alert alt = driver.switchTo().alert();
//        alt.accept();
        driver.switchTo().alert().dismiss();
    }
}