import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Importation of variable
        String password = java.lang.System.getenv("PG_PASSWORD");
        String user = java.lang.System.getenv("PG_USER");
        String url = java.lang.System.getenv("PG_URL");

        // Connect
        try {
            Connection connection = DriverManager.getConnection(
                    url,
                    user,
                    password
            );
            ResultSet result = connection.prepareStatement(
                    "select * from test;"
            ).executeQuery();
            while (result.next()){
                System.out.println(result.getInt("id"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}