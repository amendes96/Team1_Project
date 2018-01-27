package productSearch;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends CommonAPI{

    @FindBy(xpath = "//input[@placeholder='Search by keywords']")
    WebElement bar;
    @FindBy (xpath = "//a[@href='/']")
    WebElement home;
    @FindBy (xpath = "//input[@placeholder='Search by keywords']")
    WebElement bar1;
    @FindBy (xpath = "//a[@href='/']")
    WebElement home1;
    public  void okSearch(){
        bar.sendKeys("m.2", Keys.ENTER);
        home.click();
        bar1.sendKeys("Tesla k20", Keys.ENTER);
        home1.click();
        bar.sendKeys("iphone x", Keys.ENTER);
        home1.click();
    }
}
