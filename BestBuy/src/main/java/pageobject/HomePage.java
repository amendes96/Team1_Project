package pageobject;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//span[contains(.,'Best Buy Logo')]")
    WebElement logo;
    @FindBy(css = ".search-input")
    WebElement searchField;
    @FindBy(xpath = "//button[@title='Search']")
    WebElement searchBtn;
    @FindBy(id = "locationId")
    WebElement storeLocator;
    @FindBy(id = "profileMenuWrap1")
    WebElement profileMenu;
    @FindBy(xpath = "//a[contains(text(),'Weekly Ad')]")
    WebElement weeklyAdd;
    @FindBy(xpath = "//a[contains(text(),'Deal of the Day')]")
    WebElement dealOfTheDay;
    @FindBy(xpath = "//a[contains(text(),'Credit Cards')]")
    WebElement creditCards;
    @FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
    WebElement giftCards;
    @FindBy(xpath = "//a[contains(text(),'Gift Ideas & Registry')]")
    WebElement giftIdeasNRegistry;


    public boolean validateLogo(){
        return logo.isDisplayed();
    }
    public void searchItems(){
        searchField.sendKeys("iPhoneX", Keys.ENTER);
    }
    public void useSearchBtn(){
        searchField.sendKeys("Mac air Book");
        searchBtn.click();
    }
    public  String verifyCurrentUrl(){
        String actualUrl = getCurrentPageUrl();
        return actualUrl;
    }
    public String verifyPageTitle(){
        String actualTitle =driver.getTitle();
        return actualTitle;
    }
    public boolean isStoreLocatorDisplayed(){
        boolean locator = storeLocator.isDisplayed();
        return locator;
    }
    public boolean isProfileMenuEnable(){
        boolean profile = profileMenu.isEnabled();
        return profile;
    }
    public WeeklyAddPage clickOnWeeklyAdd(){
        weeklyAdd.click();
        String currentUrl = driver.getCurrentUrl();
        return new WeeklyAddPage();
    }
}
