package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DATABASE_URL = "jdbc:mysql://mysql.orb.local:3306/todoDb";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "secret";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }

}
