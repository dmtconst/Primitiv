import firstTests.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.ArrayList;

public class NewTest  extends BaseTest {
    @Test
    public void startTest(){
        System.out.println("Тест 4");

        ArrayList<String> list = new ArrayList<>();
        list.add("Фёдор Достоевский");
        list.add("Оскар Уайльд");
        list.add("Джек Лондон");
        list.add("Лев Толстой");

        Assertion a = new Assertion();
        a.assertTrue(list.contains("Оскар Уайльд"), "в библиотеке нет такого автора");
    }
}
