package operation;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection {
    static java.sql.Connection connection;

    public static java.sql.Connection getConnection() {
        if (connection == null){

            // Connect
            try {
                connection = DriverManager.getConnection(
                        System.getenv("PG_URL"),
                        System.getenv("PG_USER"),
                        System.getenv("PG_PASSWORD")
                );
                System.out.println("Connected");
            } catch (SQLException | NullPointerException e) {
                throw new RuntimeException(e);
            }
        };
        return connection;
    }

    public static PreparedStatement preparedStatement(String psql) throws SQLException{
        return getConnection().prepareStatement(psql);
    };
}
