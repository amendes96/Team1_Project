package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-open']")
    WebElement openMenu;

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-close']")
    WebElement closeMenu;

    @FindBy(xpath = "//a[contains(@data-button-name,'newsletters')]")
    WebElement email;

    @FindBy(xpath = "//a[@data-button-name='facebook']")
    WebElement huffFB;

    @FindBy(xpath = "//a[@data-button-name='twitter']")
    WebElement huffTwitter;

    @FindBy(xpath = "//a[@data-button-name='instagram']")
    WebElement huffIG;

    @FindBy(xpath = "//a[@data-button-name='snapchat']")
    WebElement huffSnapchat;

    @FindBy(xpath = "//div[contains(@class,'edition us bn-clickable')]")
    WebElement huffUSEdition;

    public void menu() throws InterruptedException{
        openMenu.click();
        Thread.sleep(3000);
        closeMenu.click();
    }
    public void slctemail() throws InterruptedException {
        email.click();
        Thread.sleep(3000);
    }
    public void slcthuffFB(){
        huffFB.click();
    }
    public void slcthuffTwitter(){
        huffTwitter.click();
    }
}
