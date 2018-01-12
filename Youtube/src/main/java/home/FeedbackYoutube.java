package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedbackYoutube {

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(xpath = ".//*[@id='id-already-subscribed']/a/span")//span[@class='copy']
    WebElement ads;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;

    @FindBy(id = "guide-button")
    WebElement menubutton;

    @FindBy(xpath = "//span[contains(.,'Send feedback')]")
    WebElement feedback;

    @FindBy(xpath = "//textarea[@rows='1']")
    WebElement giveFdback;

    public void sndfeedback(){
        signIn.click();
        ads.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
        //menubutton.click();
        feedback.click();
//        giveFdback.sendKeys("This is a test");
    }
}
