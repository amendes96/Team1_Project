package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchbyElement extends CommonAPI{

    @FindBy(id = "search")
    WebElement searchBar;

    @FindBy(xpath = "//a[@title='The Chainsmokers & Coldplay - Something Just Like This (Lyric)']")
    WebElement song;

    public void searchforMusic()throws InterruptedException{
        searchBar.sendKeys("The Chainsmokers & Coldplay - Something Just Like This (Lyric)", Keys.ENTER);
        song.click();
        Thread.sleep(280000);
    }
}
