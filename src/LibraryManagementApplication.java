import Model.BookModel;
import operation.BookCrudOperations;

import java.sql.Date;
import java.sql.SQLException;

public class LibraryManagementApplication {
    public static void main(String[] args) throws SQLException {
        BookCrudOperations bookCrudOperations = new BookCrudOperations();
        System.out.println(bookCrudOperations.findAll());
        System.out.println(bookCrudOperations.save(new BookModel(
                Double.toString(Math.random()),
                "method bocher",
                50,
                new Date(2000, 1, 1),
                "OTHER")
        ));
    }
}