package JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author postgresqltutorial.com
 */
public class Jdbc_Conn{
    private final String url = "jdbc:postgresql://192.168.1.50/trainer";
    private final String user = "trainer1";
    private final String password = "training";
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jdbc_Conn app = new Jdbc_Conn();
        app.connect();
    }
}
