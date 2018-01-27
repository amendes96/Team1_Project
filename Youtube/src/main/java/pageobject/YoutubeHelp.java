package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class YoutubeHelp extends CommonAPI{

    @FindBy(xpath = "//span[contains(.,'Help')]")
    WebElement helpbttn;

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

    @FindBy(id = "search-box")
    WebElement search4help;

    public void help() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
        Thread.sleep(2000);
        helpbttn.click();
        Thread.sleep(2000);
        helpbttn.getLocation();
//        search4help.sendKeys("Create a channel");
//        Thread.sleep(2000);
    }
}
