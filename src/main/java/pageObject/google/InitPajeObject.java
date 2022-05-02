package pageObject.google;

import io.qameta.allure.Step;
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

    @Step("Вводим текст в строку поиска")
    public void setSearchText(String text){
        setText(searchText, text);
    }

    @Step("Нажимаем на кнопку поиска")
    public void clickSubmitSearch(){
        click(submitSearch);
    }

}
