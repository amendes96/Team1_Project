package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvalidEmail {

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


    public void invalidlogin() throws InterruptedException {
        signIn.click();
        ads.click();
        email.sendKeys("ytest12789@gmail.com");
        nextButton.click();
        Thread.sleep(3000);
//        password.sendKeys("youtubeTestRunner");
//        Thread.sleep(2000);
//        passnextButtom.click();
//        Thread.sleep(5000);
    }
}
