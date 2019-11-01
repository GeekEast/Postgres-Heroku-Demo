import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = new DB().getClient();
        final String CREATE_TABLE_SQL = "CREATE TABLE account(\n" +
                "   user_id serial PRIMARY KEY,\n" +
                "   username VARCHAR (50) UNIQUE NOT NULL,\n" +
                "   password VARCHAR (50) NOT NULL,\n" +
                "   email VARCHAR (355) UNIQUE NOT NULL,\n" +
                "   created_at TIMESTAMP NOT NULL,\n" +
                "   last_login TIMESTAMP\n" +
                ");" ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(CREATE_TABLE_SQL);
        System.out.println("Table created");
    }
}
