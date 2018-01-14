package theModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shop {

    @FindBy(xpath = ".//*[@id='tsla-header-main']/div/div/nav/div[1]/ol/li[6]/ol/li[1]/a")
    WebElement shopLogo;
    @FindBy(xpath = "html/body/header/div[2]/section/nav/div/div[1]/span[2]/a")
    WebElement apparel;
    @FindBy(xpath = "html/body/header/div[2]/section/nav/div/div[1]/div[2]/div/div[6]/ul/li[4]/a")
    WebElement other;
    @FindBy(xpath = "//a[@data-colorgroupid='1061329-02-A']")
    WebElement modelS;
    @FindBy(xpath = ".//*[@id='product-color']/ul/li[2]/label")
    WebElement selectRed;
    @FindBy(xpath = "//b[@class='button']")
    WebElement Quantity;
    @FindBy(xpath = "html/body/main/div/div/div/div/article/div[3]/div[3]/div/section[2]/div/div/div[3]/div/ul/li[2]")
    WebElement select2;
    @FindBy(id = "buy")
    WebElement add;
    @FindBy(xpath = "//span[contains(.,'YOUR CART')]")
    WebElement myCart;
    @FindBy(xpath = "//a[@class='btn-primary proceed-button']")
    WebElement proceed;

    public void shopping(){
        shopLogo.click();
        apparel.click();
        other.click();
        modelS.click();
        selectRed.click();
        Quantity.click();
        select2.click();
        add.sendKeys();
        myCart.click();
        proceed.click();
    }
}
