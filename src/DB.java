import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://ec2-54-235-246-201.compute-1.amazonaws.com:5432/d87uk5edrq565u?sslmode=require&user=afzigcojjloqmn&password=ba817ef45615956f9577c3a34fd7f780905518b5c5cffb8f3ce8c60ee6f57e96";
    private final String USERNAME = "afzigcojjloqmn";
    private final String PASSWORD = "ba817ef45615956f9577c3a34fd7f780905518b5c5cffb8f3ce8c60ee6f57e96";

    private Connection conn;

    public DB() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
        }
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public Connection getClient() {
        return conn;
    }
}