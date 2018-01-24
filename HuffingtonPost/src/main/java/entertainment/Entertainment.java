package entertainment;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Entertainment extends CommonAPI{

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-open']")
    WebElement openMenu;

    @FindBy(xpath = "//a[contains(.,'\n"+"ENTERTAINMENT\n"+"')]")
    WebElement entertainment;

    @FindBy(xpath = "//a[@href='/section/arts']")
    WebElement cultureAndNews;

    @FindBy(xpath = "//a[@href='/section/media']")
    WebElement media;

    @FindBy(xpath = "//a[@href='/section/tv']")
    WebElement tvAndFilm;

    public void slctEntertainment()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        Thread.sleep(2000);
        entertainment.getLocation();
        entertainment.click();
    }
    public void slctCulture()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        Thread.sleep(2000);
        cultureAndNews.getLocation();
        cultureAndNews.click();
    }
    public void slctMedia()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        Thread.sleep(2000);
        media.click();
    }

    public void entertainmentfun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctEntertainment();
    }
    public void culturefun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctCulture();
    }
    public void mediafun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctMedia();
    }
}
