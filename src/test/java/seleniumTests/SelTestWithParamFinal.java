package seleniumTests;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPajeObject;
import pageObject.google.SearchResultPageObject;
import testData.WordsTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class SelTestWithParamFinal extends BaseTest {

    @DataProvider(name="setWords",parallel = false)
    public Object[][] getData(){
        Object[][] words = new Object[][]{
                {new WordsTestData("word").getWord1(),"word1"},
                {new WordsTestData("word").getWord2(),"word2"},
                {new WordsTestData("word").getWord3(),"word3"}

        };
        return words;
    }


    @Epic("Селениум")
    @Feature("Гугл тесты")
    @Story("Проверяем поиск с параметрами")
    @Description("Слова")
    @Test(dataProvider = "setWords")
    public void startTest(String word, String testName){
        c.logToReport("ссылка на стенд:" + stenfUrl);
        getDriver().get(stenfUrl);
        getDriver().manage().window().maximize();

        InitPajeObject in = new InitPajeObject(getDriver());
        in.setSearchText("Привет");
        in.clickSubmitSearch();
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isImagesTubButtonIsExist());

//        //скриншоты
//        File file = new File("./src/main/resources/screenShot" + testName +".jpg");
//            try {
//                FileUtils.writeByteArrayToFile(file,getScreenShot());
//            } catch (IOException e){
//                e.printStackTrace();
//            }

    }

//    @Test
//    public void homeWork(){
//        getDriver().get("https://www.google.ru/");
//        getDriver().manage().window().maximize();
//
//        InitPajeObject in = new InitPajeObject(getDriver());
//        in.setSearchText("YouTube");
//        in.clickSubmitSearch();
//
//        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
//        Assertion as = new Assertion();
//        as.assertTrue(sr.isImagesTubButtonIsExist());
//    }


}
