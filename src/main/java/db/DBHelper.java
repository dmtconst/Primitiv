package db;

import java.net.PortUnreachableException;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBHelper {

    static String url = "jdbc:mysql://db4free.net:3306/testdatabase9290";
    static String userName = "testdatabase9290";
    static String password = "123qweASD";

    static Connection con = null;
    static Statement st = null;

    //подключение к драйверу к базе
    public static Connection init(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,userName,password); //способ подключения
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static ArrayList<HashMap<String, Object>> getSqlResult(final String sql) {

        ResultSet rs = null;
        init(); //инициализирует соединение метода Connection

        ArrayList<HashMap<String, Object>> sqlResult = new ArrayList<>();//каждый ключ в данном случае это строка, а значение объект

        HashMap<String, Object> map = null;

        try {
            st = con.createStatement(); //cоздание коннекта после подключения
            rs = st.executeQuery(sql); //выполнение запроса sql команд

            ResultSetMetaData rsmd = rs.getMetaData(); //нзвание столбцов

            while (rs.next()) {
                map = new HashMap<String, Object>(rsmd.getColumnCount()); //создание строки ключ значение
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    if (rs.getObject(i) == null) {
                        map.put(rsmd.getColumnName(i), ""); //тут я не пойму почему значение "" ?
                    } else {
                        map.put(rsmd.getColumnName(i), rs.getObject(i)); //имя столбца , значение
                    }
                }
                sqlResult.add(map);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                rs.close();
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                st.close();
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                con.close();
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sqlResult;
    }

    public static String getValueRow(String sql, String colName){
        String value = getSqlResult(sql).stream().toString();
        return value;
    }



    public static int insertSqlResult(final String sql) {

        int rs = 0;
        init();

        try {
            st = con.createStatement(); //cоздание коннекта
            rs = st.executeUpdate(sql); //колл строк


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

            try {
                st.close();
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                con.close();
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }




}