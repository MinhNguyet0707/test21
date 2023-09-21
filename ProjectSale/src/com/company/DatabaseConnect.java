package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    public  static Connection connection;

    public  DatabaseConnect() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
//                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                String url = "jdbc:mySQL://localhost:3306/project_sale";
                String user = "root";
                String password = "";
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
