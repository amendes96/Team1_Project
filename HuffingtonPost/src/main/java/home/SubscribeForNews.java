package home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscribeForNews {

    @FindBy(xpath = "//a[contains(@data-button-name,'newsletters')]")
    WebElement email;

    @FindBy(name = "email_address")
    WebElement enteremail;

    @FindBy(xpath = "//input[@value='track-hate']")
    WebElement trackHate;

    @FindBy(xpath = "//input[@data-rapid_p='10']")
    WebElement theMorningEmail;

    @FindBy(xpath = "//input[@data-rapid_p='13']")
    WebElement mustRead;

    @FindBy(xpath = "//input[@value='black-voices']")
    WebElement blackVoices;

    @FindBy(xpath = "//input[@value='parents']")
    WebElement jerkcat;

    @FindBy(xpath = "//input[@value='lifestyle']")
    WebElement goodLife;

    @FindBy(xpath = "//input[@value='entertainment']")
    WebElement entertainmentCat;

    @FindBy(xpath = "//input[@value='politics']")
    WebElement politicsCat;

    @FindBy(xpath = "//input[@value='queer-voices']")
    WebElement queerVoices;

    @FindBy(xpath = "//input[@value='women']")
    WebElement information;

    @FindBy(xpath = "//input[@value='highline']")
    WebElement highline;

    @FindBy(xpath = "//input[@value='funniest-tweets-from-women']")
    WebElement funniestTweets;

    @FindBy(xpath = "//input[@value='horoscopes']")
    WebElement horoscopes;

    @FindBy(xpath = "//input[@value='royal-wedding-us']")
    WebElement royaPost;

    @FindBy(xpath = "//input[@value='this-new-world']")
    WebElement newWorld;

    @FindBy(xpath = "//input[@value='Subscribe']")
    WebElement subscribebttn;

    public void subscribetoall() throws InterruptedException {
        email.click();
        trackHate.click();
        theMorningEmail.click();
        mustRead.click();
        blackVoices.click();
        jerkcat.click();
        goodLife.click();
        entertainmentCat.click();
        politicsCat.click();
        queerVoices.click();
        information.click();
        highline.click();
        funniestTweets.click();
        horoscopes.click();
        royaPost.click();
        newWorld.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtomorningemail()throws InterruptedException{
        email.click();
        theMorningEmail.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtogoodlife()throws InterruptedException{
        email.click();
        goodLife.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtoentertainment()throws InterruptedException{
        email.click();
        entertainmentCat.click();
        entertainmentCat.isDisplayed();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtofunniesttweets()throws InterruptedException{
        email.click();
        funniestTweets.isDisplayed();
        funniestTweets.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtopolitics()throws InterruptedException{
        email.click();
        politicsCat.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtoinformation()throws InterruptedException{
        email.click();
        information.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtonewworld()throws InterruptedException{
        email.click();
        newWorld.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
    public void subtoroyalnews()throws InterruptedException{
        email.click();
        royaPost.click();
        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
    }
}
//          email.click();
//
//        enteremail.sendKeys("abcd1234@gmail.com", Keys.ENTER);
//        Thread.sleep(3000);
