package dbTest;

import db.DBHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static db.DBHelper.getSqlResult;


public class DBGetTest {
    @Test
    public void startTest(){
        String sql = "SELECT * FROM REGISTRATION";

//       DBHelper.getSqlResult(sql).forEach(s-> System.out.println(s));
//       System.out.println("_________________________________________");

        //создаем в таблице
        var insertToDB = "INSERT INTO REGISTRATION (id,last, first,age) VALUES (66658,'Salam','Malekum',666)";
        DBHelper.insertSqlResult(insertToDB);


       ArrayList<HashMap<String,Object>> finish = DBHelper.getSqlResult(sql);

       for (HashMap<String,Object> rrrrr : finish){
//           if(rrrrr.containsValue("Salam")){
//               System.out.println("!!!!");
//           }

           if(rrrrr.get("id").toString().contains("66658")){
//               System.out.println(rrrrr.get("last"));
               Assert.assertTrue((rrrrr.get("id").toString().contains("666")),"Нет такого id");
           }

       }

//      String sql = "SELECT * FROM REGISTRATION";
//      DBHelper.getSqlResult(sql).forEach(s-> System.out.println(s));

//      var requestToDB = "SELECT * FROM REGISTRATION WHERE id=666";
//      DBHelper.getSqlResult(requestToDB).forEach(s-> System.out.println(s));

//      "id=666, last=Salam, first=Malekum, age=666"

    }

}
