package firstTests;

import metods.ForConstructor;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{

    String firstParam = "Кто виноват?";
    String secondParam = "NoBoby";

    @Parameters({"IDont","IKnow"})
    @Test
    public void startTest(@Optional String firstParam,@Optional String secondParam){
        System.out.println("Первый параметр " + firstParam);
        System.out.println("Второй параметр " + secondParam);
        System.out.println("На самом деле " + this.firstParam + " " + this.secondParam);
        System.out.println("0_________________________________________________________");

        this.firstParam = firstParam;
        this.secondParam = secondParam;
    }

    @Test(priority = 1)
    public void startTest(){
        System.out.println("Первый параметр " + firstParam);
        System.out.println("Второй параметр " + secondParam);
        System.out.println("На самом деле " + this.firstParam + " " + this.secondParam);
        System.out.println("1_________________________________________________________");
    }

    @Test(priority = 2)
    public void startTestV2(){
        ForConstructor con = new ForConstructor();

        System.out.println(" Первый параметр " + firstParam);
        System.out.println("Второй параметр " + secondParam);
        System.out.println("На самом деле " + con.constParam1 + " " + con.constParam2);
        System.out.println("2_________________________________________________________");
    }


}
