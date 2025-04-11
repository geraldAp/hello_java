import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://mysql.orb.local:3306/javaTutDb";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "secret";

    public static void main(String[] args) throws Exception {

        Connection connection = null;
        Statement statement = null;

        try {
            // make the connection to the database
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "email VARCHAR(100) UNIQUE)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully or already exists.");

            // Step 2: Insert data into the table
            String insertSQL = "INSERT INTO users (name, email) "
                    + "VALUES ('John Doe', 'john.doe@example.com')";
            statement.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {

                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
