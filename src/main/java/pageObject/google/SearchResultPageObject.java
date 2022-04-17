package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='main']//a[contains(.,'Картинки')]")
    private WebElement imagesTab;

    @FindBy(xpath = ".//a[contains(@aria-label,'Поиск картинок для YouTube')]")
    private WebElement imagesYouTube;

    /**
     * Проверка что кнопка "Картинки" существует на странице
     * @return
     */
    public Boolean isImagesTubButtonIsExist(){
        return waitVisibilityElement(imagesTab);
    }

    public Boolean isImgYouTubeExist(){
        return waitVisibilityElement(imagesYouTube);
    }
}
