package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPajeObject extends Base {

    public InitPajeObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//form//input[@title='Поиск' and @aria-label]")
    private WebElement searchText;

    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;

    @FindBy(xpath = ".//a[contains(.,'www.youtube.com')]")
    private WebElement buttonYTube;

    public void setSearchText(String text){
        setText(searchText, text);
    }

    public void clickSubmitSearch(){
        click(submitSearch);
    }

}
