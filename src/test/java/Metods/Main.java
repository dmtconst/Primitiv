package Metods;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(Metods.variables("Variant2"));
        System.out.println("---------------------------------");
        System.out.println(Metods.variables2(2));
        System.out.println("---------------------------------");
        System.out.println(Metods.variable3(3));
        System.out.println("---------------------------------");
        for (int a = 1; a <= 3 ; a++){
            System.out.println("Значение "+ a);
        }
        System.out.println("---------------------------------");

        int value = 2;
        while (value <= 10){
            value = value + 3;
            System.out.println(value);
        }
        System.out.println("---------------------------------");

        long value2 = 100;
        if(value2 < 1000){
            System.out.println("В молоко");
        }else if (value2 == 1000){
            System.out.println("В яблочко");
        }
        System.out.println("---------------------------------");

        byte index = 10;
        int result = 0;
        while(result != index){
            result++;
            if (result == 5){
                System.out.println("byte = " +  result);
            } else if(result == 7){
                System.out.println("byte = " +  result);
            } else if (result == index){
                System.out.println("byte = " +  result + " End of sum");
            }

        }


        int x = 2;
        int y = 4;
        double z = 3.5;
        if(x == y && z < x){
            System.out.println("Результат 1");
        } else if(x != 4){
            System.out.println("Результат 2");
        }else {
            System.out.println("Результата нет");
        }
    }


}
