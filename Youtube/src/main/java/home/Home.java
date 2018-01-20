package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Home extends CommonAPI{

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(xpath = ".//*[@id='id-already-subscribed']/a/span")//span[@class='copy'] //span[contains(.,'Already A Member?')]
    WebElement ads;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;

    @FindBy(id = "guide-button")
    WebElement menubutton;

    @FindBy(xpath = "//span[contains(.,'History')]")
    WebElement history;

    @FindBy(xpath = ".//*[@id='radioContainer']")
    WebElement searchHistory;

    @FindBy(xpath = "//span[contains(.,'Trending')]")
    WebElement trending;

    @FindBy(xpath = "//span[contains(.,'Subscriptions')]")
    WebElement subscription;

    @FindBy(xpath = "//span[contains(.,'Browse channels')]")
    WebElement browseCh;

    @FindBy(xpath = "//span[contains(.,'YouTube Red')]")
    WebElement youtubeRed;

    @FindBy(xpath = "//span[contains(.,'Movies')]")
    WebElement youtubemovies;

    @FindBy(xpath = "//span[contains(.,'Sports')]")
    WebElement sports;

    @FindBy(xpath = "//span[contains(.,'Gaming')]")
    WebElement gaming;

    @FindBy(xpath = "//span[contains(.,'TV Shows')]")
    WebElement tvShows;

    @FindBy(xpath = "//span[contains(.,'News')]")
    WebElement news;

    @FindBy(xpath = "//span[contains(.,'Live')]")
    WebElement live;

    @FindBy(xpath = "//span[contains(.,'Spotlight')]")
    WebElement spotlight;

    @FindBy(xpath = "//span[contains(.,'360° Video')]")
    WebElement threesixtyvideo;

    @FindBy(xpath = "//span[contains(.,'Settings')]")
    WebElement settings;

    @FindBy(xpath = "//span[contains(.,'Help')]")
    WebElement helpbttn;

    @FindBy(xpath = "//button[@id='avatar-btn']")
    WebElement account;

    public String isCorrectUrl(){
        String actualUrl = getCurrentPageUrl();
        return actualUrl;
    }

    public void history() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //menubutton.click(); //menu button is only for running on cloud server
        history.click();
        Thread.sleep(5000);
    }
    public void trendingpage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        trending.click();
        Thread.sleep(5000);
    }
    public void subs() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        subscription.click();
        Thread.sleep(3000);
    }
    public void browsingch()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        browseCh.click();
        Thread.sleep(2000);
    }
    public void youtubered() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubeRed.click();
        Thread.sleep(3000);
    }
    public void movies() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubemovies.click();
        Thread.sleep(3000);
    }
    public void youtubesettings() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        settings.click();
        Thread.sleep(3000);
    }
    public void utubehlp()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpbttn.click();
        helpbttn.getLocation();
        Thread.sleep(2000);
    }
    public void accountinfo() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        account.click();
        Thread.sleep(2000);
    }
}
