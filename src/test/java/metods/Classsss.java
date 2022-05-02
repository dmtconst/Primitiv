package metods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Classsss {
    public static void main(String[] args) {
        //добавление в массив
        ArrayList<String> fff = new ArrayList<>();
        fff.add("Добавил строку в массив");

        //добавление в ккарту
        HashMap<String, Object> mapp = new HashMap<>();
        mapp.put("Ключ","Ключ Значение");

        for (String ggg: fff){
            if(ggg.contains("стока1")){
                System.out.println("Строка нашлась");
            }
        }

        ArrayList<HashMap<String, Object>> neeee = new  ArrayList();
        neeee.add(mapp);

        for (HashMap<String, Object> nrrrr : neeee ){
            if(nrrrr.containsValue("новый новй")){
                System.out.println("кааааа");
            }
        }

        mapp.get("cnhjrf2");
    }



}
