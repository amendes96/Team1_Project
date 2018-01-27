package productSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category extends CommonAPI{

    @FindBy(xpath = "//a[contains(.,'Electronics')]")
    WebElement elc;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back1;
    @FindBy(xpath = "//a[contains(.,'Clothing, Shoes & Accessories')]")
    WebElement clothing;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back2;
    @FindBy(xpath = "//a[contains(.,'Home & Outdoor')]")
    WebElement home;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back3;
    @FindBy(xpath = "//a[contains(.,'Beauty & Personal Care')]")
    WebElement beauty;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back4;
    @FindBy(xpath = "//a[contains(.,'Health')]")
    WebElement health;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back5;
    @FindBy(xpath = "//a[contains(.,'Sports & Fitness')]")
    WebElement sports;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back6;
    @FindBy(xpath = "//a[contains(.,'Bags & Luggage')]")
    WebElement bag;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back7;
    @FindBy(xpath = "//a[contains(.,'Toys, Toddlers & Baby')]")
    WebElement toys;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back8;
    @FindBy(xpath = "//a[contains(.,'Pet Supplies')]")
    WebElement pet;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back9;
    @FindBy(xpath = "//a[contains(.,'Media')]")
    WebElement media;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back10;
    @FindBy(xpath = "//a[contains(.,'Food & Beverage')]")
    WebElement food;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back11;
    @FindBy(xpath = "//a[contains(.,'Office Supplies')]")
    WebElement office;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back12;
    @FindBy(xpath = "//a[contains(.,'Automotive & Parts')]")
    WebElement auto;
    @FindBy(xpath = "//span[contains(.,'Go back')]")
    WebElement back13;
    @FindBy(xpath = "//a[contains(.,'Everything Else')]")
    WebElement end;

    public void allCategory() {
        elc.click();
        back1.click();
        back1.isDisplayed();
        navigateBack();
    }

    public void clothes() throws InterruptedException {
        clothing.click();
        clothing.getLocation();
        back2.click();
    }

    public void homeItems() throws InterruptedException {
        home.click();
        back3.click();
    }

    public void beatyItems() throws InterruptedException {
        beauty.click();
        back4.click();
    }

    public void healthItems() throws InterruptedException {
        health.click();
        back5.click();
    }

    public void sportingIteam() throws InterruptedException {
        sports.click();
        back6.click();
    }

    public void bagItems() throws InterruptedException {
        bag.click();
        back7.click();
    }

    public void toysItem() throws InterruptedException {
        toys.click();
        back8.click();
    }

    public void petItems() throws InterruptedException {
        pet.click();
        back9.click();
    }

    public void mediaItems() throws InterruptedException {
        media.click();
        back10.click();
    }

    public void foodItems() throws InterruptedException {
        food.click();
        back11.click();
    }

    public void officeItems() throws InterruptedException {
        office.click();
        back12.click();
    }

    public void autoParts() throws InterruptedException {
        auto.click();
        back13.click();
    }

    public void ending() throws InterruptedException {
        end.click();
    }
}
