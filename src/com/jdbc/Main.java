package com.jdbc;

import java.sql.*;

public class Main {

        // Блок объявления констант
        public static final String DB_URL = "jdbc:h2:/c:/Users/Programmer/IdeaProjects/Home_121_JDBC_Connection/db/stockExchange";
        public static final String DB_Driver = "org.h2.Driver";

        public static void main(String[] args) {
            try {
                Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД
                Connection connection = DriverManager.getConnection(DB_URL);//соединениесБД
                System.out.println("Соединение с СУБД выполнено.");
                connection.close();       // отключение от БД
                System.out.println("Отключение от СУБД выполнено.");
            } catch (ClassNotFoundException e) {
                e.printStackTrace(); // обработка ошибки  Class.forName
                System.out.println("JDBC драйвер для СУБД не найден!");
            } catch (SQLException e) {
                e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
                System.out.println("Ошибка SQL !");
            }
        }
    }
