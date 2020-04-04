package grupod.activitymanagerapi.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iego_
 */
public class DBConfig {
    
    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://host:port/postgres";
    private static final String DB_USER = "user";
    private static final String DB_PASSWORD = "password";

    private static final String PORTAL_URL = "http://localhost:8080/";
    private static final String REPORTS_PATH = "//servidor/C/Reports";
    
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DB_DRIVER);
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    
}
