public class LibraryManagementApplication {
    public static void main(String[] args) {
        String password = java.lang.System.getenv("PG_PASSWORD");
        System.out.println(password);
    }
}