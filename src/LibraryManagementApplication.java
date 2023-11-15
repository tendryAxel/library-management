import java.sql.DriverManager;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Importation of variable
        String password = java.lang.System.getenv("PG_PASSWORD");
        String user = java.lang.System.getenv("PG_USER");
        String url = java.lang.System.getenv("PG_URL");
    }
}