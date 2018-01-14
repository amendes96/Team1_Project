package theModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestDrive {

    @FindBy(xpath = ".//*[@id='article_content']//a[4]")
    WebElement testdriveLogo;
    @FindBy(xpath = ".//*[@id='edit-firstname-td']")
    WebElement firstName;
    @FindBy(xpath = ".//*[@id='edit-lastname-td']")
    WebElement lastName;
    @FindBy(xpath = ".//*[@id='edit-phonenumber-td']")
    WebElement phoneNumber;
    @FindBy (id = "edit-usermail-td")
    WebElement enterEmail;
    @FindBy(id = "edit-zipcode-td")
    WebElement enterZip;
    @FindBy (xpath = "//i[@class='icon-checkbox']")
    WebElement teslaUpdates;
    @FindBy(id = "edit-submit-td-ajax")
    WebElement submitButton;

    public void freeDriving(){
        testdriveLogo.click();
        firstName.sendKeys("bruce");
        lastName.sendKeys("wayne");
        phoneNumber.sendKeys("800633933");
        enterEmail.sendKeys("blabla@yahoo.com");
        enterZip.sendKeys("11427");
        teslaUpdates.click();
        submitButton.click();
    }
}
