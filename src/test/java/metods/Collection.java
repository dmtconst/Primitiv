package metods;

import inheritance.Cat;
import inheritance.Dog;
import org.apache.cassandra.streaming.StreamOut;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 12;
        num[1] = 13;
        num[2] = 14;
        System.out.println(num[1]);

        String[] str = {"2","43","32"};
        System.out.println(str[0]);


        ArrayList<String> list = new ArrayList<>();
        list.add("meta1");
        list.add("meta22");
        list.add("meta3111");
        System.out.println(list + "Этолиииии");

        for (String i : list){
            System.out.println("ForEach длина строки = " + i.length());
        }

        list.forEach(s -> System.out.println("Применение стрим" + s));

        list.stream().filter(s -> s.length()<6).forEach(s -> System.out.println("фильтрованный метод" + s));

        list.stream().filter(s -> s.contains("2")).forEach(s -> System.out.println("содержит " + s));

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Key", 1);
        map.put("Key1", 2);
        map.put("Key2", 3);
        System.out.println("Заначение в ключе Key1 = " + map.get("Key1"));
        System.out.println(map + "Этааааа");


        Set<String> set;
        set = map.keySet();
        set.forEach(s -> System.out.println("Значение ключа в map = " + s));

        for(String s : set){
            System.out.println("Значение ключа " + s + " = значению " + map.get(s));
        }

        System.out.println("________________________________________________________");
        List collection = new ArrayList();
        collection.add("Значение 1");
        collection.add("Значение 2");
        collection.add("3");
        collection.forEach(s-> System.out.println(s));
        collection.set(0,"Замена 1-го элемента");
        collection.forEach(s-> System.out.println(s));
        collection.add(1,"Добавим 5");
        collection.forEach(s-> System.out.println(s));
        System.out.println("________________________________________________________");
        List numcollection = new ArrayList();
        numcollection.add(0);
        numcollection.add(1);
        numcollection.forEach(s-> System.out.println(s));
        numcollection.add(0,12);
        numcollection.forEach(s-> System.out.println(s));
        System.out.println("________________________________________________________");

        
        HashMap map2 = new HashMap();
        map2.put(1,new Cat("MARFA").getName());
        map2.put(5,new Pig("Nix-nux").getName());
        map2.put(7,new Dog("Sharik").getName());
        System.out.println(map2.get(1));
        System.out.println(map2.get(5));
        System.out.println(map2.get(7));
    }


}
