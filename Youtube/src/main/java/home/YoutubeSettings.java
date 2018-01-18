package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class YoutubeSettings extends CommonAPI{

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;

    @FindBy(xpath = "//span[contains(.,'Settings')]")
    WebElement setting;

    @FindBy(xpath = "//a[@data-upsell='settings']")
    WebElement creatingChannel;

    @FindBy(name = "given_name")
    WebElement enterfirstname;

    @FindBy(name = "family_name")
    WebElement enterlastName;

    @FindBy(xpath = "//button[contains(.,'CREATE CHANNEL')]")
    WebElement createch;

    public void sttgs()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
        setting.click();
        Thread.sleep(2000);
        creatingChannel.click();
        enterfirstname.sendKeys("Pro", Keys.TAB);
        enterlastName.sendKeys("Tester");
        //createch.click();
        Thread.sleep(3000);
    }
}
