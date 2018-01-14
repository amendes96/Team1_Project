package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DropDownMenu extends CommonAPI{

    Actions actions = new Actions(driver);

    @FindBy(css = "#nav-link-shopall > span.nav-line-2")
    WebElement departments;

    @FindBy(css = "#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > a > span")
    WebElement fullStoreDirectory;

    @FindBy(css = "#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span:nth-child(6) > span")
    WebElement fireTv;

    @FindBy(css = "#nav-flyout-shopAll > div.nav-subcats > div:nth-child(6) > div.nav-column.nav-column-first > div > a:nth-child(3) > span.nav-text")
    WebElement allFireTV;

    public void dropDown(){
        actions.moveToElement(departments).moveToElement(fullStoreDirectory).click().build().perform();
    }

    public void mouseHover(){
        actions.moveToElement(departments).moveToElement(fireTv).moveToElement(allFireTV).click().build().perform();
    }
}
