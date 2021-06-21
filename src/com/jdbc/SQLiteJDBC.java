package com.jdbc;

import java.sql.*;

public class SQLiteJDBC {
    public static void main( String args[] ) {
        Connection c = null; // соединение

        try {
            Class.forName("org.sqlite.JDBC"); // формат бд
            c = DriverManager.getConnection("jdbc:sqlite:test.db"); // выбираем бд из фалов и соединяемся
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() ); // ошибка
            System.exit(0);
        }
        System.out.println("БД открыта, успех!");
    }
}
