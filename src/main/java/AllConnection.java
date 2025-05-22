
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Database connection manager for the Hospital Management System.
 * Provides methods to get and close database connections.
 */
public class AllConnection {
    private static Connection con = null;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    /**
     * Gets a database connection.
     * @return Connection object or null if connection fails
     */
    public static Connection getConnection() {
        if (con != null) {
            try {
                if (!con.isClosed()) {
                    return con;
                }
            } catch (SQLException ex) {
                System.err.println("Previous connection invalid: " + ex.getMessage());
            }
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return con;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Database driver not found. Please check your installation.", 
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Database driver error: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to connect to database. Please check that the database server is running.", 
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Database connection error: " + ex.getMessage());
        }
        return null;
    }

    /**
     * Closes the current database connection if open.
     */
    public static void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                con = null;
            }
        } catch (SQLException ex) {
            System.err.println("Error closing database connection: " + ex.getMessage());
        }
    }
}
