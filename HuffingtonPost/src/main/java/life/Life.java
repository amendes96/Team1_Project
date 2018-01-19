package life;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Life extends CommonAPI{

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-open']")
    WebElement openMenu;

    @FindBy(xpath = "//a[contains(.,'\n"+"LIFE\n"+"')]")
    WebElement lifestyle;

    @FindBy(xpath = "//a[@href='/section/style']")
    WebElement stylenbeauty;

    @FindBy(xpath = "//a[@href='/section/travel']")
    WebElement travel;

    public void slctLife() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        Thread.sleep(1000);
        lifestyle.click();
        Thread.sleep(2000);
    }
    public void slctstylenbeauty() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        stylenbeauty.click();
        Thread.sleep(2000);
    }
    public void slcttravel()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        travel.click();
        Thread.sleep(2000);
    }
    public void lifefun() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctLife();
    }
}
