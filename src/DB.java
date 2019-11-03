import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://<address>:<port>/<database>?sslmode=require&user=<username>&password=<password>";

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
