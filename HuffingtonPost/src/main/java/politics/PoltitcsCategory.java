package politics;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class PoltitcsCategory extends CommonAPI{

    //((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-open']")
    WebElement openMenu;

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-close']")
    WebElement closeMenu;

    @FindBy(xpath = "//a[contains(.,'\n"+"POLITICS\n"+"')]")
    WebElement politics;

    @FindBy(xpath = "//a[contains(.,'\n"+"Donald Trump\n"+"')]")
    WebElement donaldTrump;

    public void slcttoopenmenu() throws InterruptedException {
        openMenu.getLocation();
        openMenu.click();
        Thread.sleep(2000);
    }
    public void slctpolitic(){
        openMenu.click();
        politics.getLocation();
        politics.click();
    }
    public void slctTrump(){
        openMenu.click();
        donaldTrump.getLocation();
        donaldTrump.click();
    }
    public void slctPolitics()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slcttoopenmenu();
        slctpolitic();
    }
    public void slctDonaldTrump(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctTrump();
    }
}
