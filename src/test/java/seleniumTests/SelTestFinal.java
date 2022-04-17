package seleniumTests;


import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPajeObject;
import pageObject.google.SearchResultPageObject;


public class SelTestFinal extends BaseTest {

    @Test
    public void startTest(){
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();

        InitPajeObject in = new InitPajeObject(getDriver());
        in.setSearchText("Привет");
        in.clickSubmitSearch();

        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isImagesTubButtonIsExist());
    }

    @Test
    public void homeWork(){
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();

        InitPajeObject in = new InitPajeObject(getDriver());
        in.setSearchText("YouTube");
        in.clickSubmitSearch();

        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isImagesTubButtonIsExist());
    }



}
