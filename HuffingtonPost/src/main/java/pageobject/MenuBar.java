package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBar extends CommonAPI{

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-open']")
    WebElement openMenu;

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-close']")
    WebElement closeMenu;

    @FindBy(xpath = "//a[contains(.,'\n"+"NEWS\n"+"')]")
    WebElement news;

    @FindBy(xpath = "//a[contains(.,'\n"+"POLITICS\n"+"')]")
    WebElement politics;

    @FindBy(xpath = "//a[contains(.,'\n"+"ENTERTAINMENT\n"+"')]")
    WebElement entertainment;

    @FindBy(xpath = "//a[contains(.,'\n"+"LIFESTYLE\n"+"')]")
    WebElement lifestyle;

    @FindBy(xpath = "//a[contains(.,'\n"+"VOICES\n"+"')]")
    WebElement voices;

    @FindBy(xpath = "//h3[contains(.,'\n"+"FROM OUR PARTNERS\n"+"')]")
    WebElement fromOurPartners;

    @FindBy(xpath = "//a[contains(.,'\n"+"IMPACT\n"+"')]")
    WebElement impact;

    @FindBy(xpath = "//h3[contains(.,'\n" + "MULTIMEDIA\n"+"')]")
    WebElement multimedia;

    @FindBy(xpath = "//a[@href='//www.huffingtonpost.com/newsletters']")
    WebElement newsletter;

    public void menuBar() throws InterruptedException {
        openMenu.click();
        news.click();
//        Thread.sleep(3000);
        driver.navigate().refresh();
        openMenu.click();
        politics.click();
//        Thread.sleep(2000);
        openMenu.click();
        entertainment.click();
//        Thread.sleep(3000);
        openMenu.click();
        lifestyle.click();
//        Thread.sleep(2000);
        openMenu.click();
        voices.isSelected();
//        Thread.sleep(2000);
        driver.navigate().to(getCurrentPageUrl());
        openMenu.click();
        impact.click();
    }
}
