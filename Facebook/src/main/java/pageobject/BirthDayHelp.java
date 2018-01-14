package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthDayHelp extends CommonAPI{

    @FindBy(xpath = "BirthDayHelp")
    WebElement birthDayHelp;

    public void setBirthDayHelp() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(3000);
        birthDayHelp.click();
    }
}
