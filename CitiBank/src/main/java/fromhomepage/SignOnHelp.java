package fromhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnHelp extends CommonAPI {
    @FindBy(id ="email-inline-radio-label")
    WebElement checkRadioButton;
    @FindBy(id="email")
    WebElement emailInput;
    @FindBy(xpath ="//button[contains(text(),'Continue')]")
    WebElement continueButton;
    public void useRadioButton(){
        checkRadioButton.click();
        emailInput.sendKeys("abc123@gmail.com");
        continueButton.click();
    }
}
