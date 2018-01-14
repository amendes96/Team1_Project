package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogo extends CommonAPI{

    @FindBy(xpath = "Facebook")
    WebElement fbLogo;

    public void setFbLogo(){
        PageFactory.initElements(driver,this);
        fbLogo.click();
    }
}
