package firstTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SecondTest extends BaseTestFirst {

    @DataProvider(name = "SetEnviroment", parallel = true)
    public Object[][] getDats(){
        Object[][] browserVersion = new Object[][]{
                {"Chome","89"},
                {"Yandex","13"},
        };
        return  browserVersion;
    }

    @Test
    public void startTest(){
        System.out.println("Стартуем тест");
    }

    @Test(dataProvider = "SetEnviroment")
    public void startTest(String browser, String version){
        System.out.println("Тест для " + browser + "=" + version);

        Assertion a = new Assertion();
        a.assertTrue(version.equalsIgnoreCase("80"));
    }

}
