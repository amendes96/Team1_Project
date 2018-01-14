package theModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Energy {

    @FindBy(xpath = "//a[@href='/energy']")
    WebElement goEnergy;
    @FindBy(xpath = "//a[contains(.,'Solar Panels')]")
    WebElement solar;
    @FindBy(id = "edit-firstname")
    WebElement firstName;
    @FindBy(id = "edit-lastname")
    WebElement lastName;
    @FindBy(xpath = "//input[@name='phone']")
    WebElement phoneNumber;
    @FindBy (id = "edit-email")
    WebElement enterEmail;
    @FindBy(id = "edit-postalcode")
    WebElement enterZip;
    @FindBy (xpath = "//input[@name='timetocall']")
    WebElement timeToCall;
    @FindBy (xpath = "//i[@class='icon-checkbox']")
    WebElement smallBox;
    @FindBy (id = "edit-submit-ajax")
    WebElement submitBox;

    public void freeEstimate(){
        goEnergy.click();
        solar.click();
        firstName.sendKeys("bruce");
        lastName.sendKeys("wayne");
        phoneNumber.sendKeys("800633733");
        enterEmail.sendKeys("blablabla@yahoo.com");
        enterZip.sendKeys("11427");
        timeToCall.sendKeys("7 am please");
        smallBox.click();
        submitBox.click();
    }
}
