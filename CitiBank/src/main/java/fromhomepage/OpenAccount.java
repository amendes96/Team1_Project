package fromhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccount extends CommonAPI {
    @FindBy(id = "RegionalPricingLocation-snapshot-button")
    WebElement scrollBtn;
    @FindBy(id = "RegionalPricingLocation-snapshot")
    WebElement states;
    @FindBy(xpath = "//span[contains(@class,'ui-selectmenu-icon ui-icon ui-icon-triangle-1-s')]")
    WebElement selectState;
    @FindBy(xpath = "//a[contains(text(),'SELECT')]")
    WebElement submitBtn;

    public void selectRegion() throws InterruptedException{
        scrollBtn.click();
        Thread.sleep(3000);
//        selectState.click();
        Select sel = new Select(states);
        sel.selectByVisibleText("AA");
        submitBtn.click();
    }
}
