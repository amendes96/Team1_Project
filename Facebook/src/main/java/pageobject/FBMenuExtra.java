package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBMenuExtra extends CommonAPI{

    @FindBy(xpath="CreateAPage")
    WebElement createAPage;
    @FindBy(linkText = "EnglishUs")
    WebElement english;
    @FindBy(xpath = "EsPeNol")
    WebElement esPeNol;

    public void testFBMenuExtra() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(3000);
        createAPage.click();
        english.click();
        esPeNol.click();
    }
}
