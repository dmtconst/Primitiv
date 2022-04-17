package firstTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestForXML extends BaseTestFirst {

    String parametrName;
    String parametrSurname;

    @Parameters({"name","surname"})
    @Test
    public void startTest( String parametrName, String parametrSurname){
        this.parametrName = parametrName;
        this.parametrSurname = parametrSurname;
        System.out.println(parametrName + parametrSurname);
        System.out.println("name" + "surname");
    }
}
