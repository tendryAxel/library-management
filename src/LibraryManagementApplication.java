import operation.BookCrudOperations;

import java.sql.SQLException;

public class LibraryManagementApplication {
    public static void main(String[] args) throws SQLException {
        BookCrudOperations bookCrudOperations = new BookCrudOperations();
        System.out.println(bookCrudOperations.findAll());
    }
}