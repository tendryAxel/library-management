public class LibraryManagementApplication {
    public static void main(String[] args) {
        String password = java.lang.System.getenv("PG_PASSWORD");
        String user = java.lang.System.getenv("PG_USER");
        String url = java.lang.System.getenv("PG_URL");
        System.out.println(password);
        System.out.println(user);
        System.out.println(url);
    }
}