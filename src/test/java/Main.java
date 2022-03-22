import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        for (int a = 1; a <= 127; a++){
            System.out.println("Максимальное значение Integer" + a);
        }

        int value = 2;
        while (value <= 30){
            value = value + 3;
            System.out.println(value);
        }

        int index = 1;
        while(index <= 40)
        if (index ==  20){
            System.out.println("Integer  20");
        } else if(index == 30){
            System.out.println("Integer  30");
        } else {
            System.out.println("err");
        }



    }
}
