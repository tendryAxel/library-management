package test;

import Model.BookModel;
import operation.BookCrudOperations;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class test {
    public static void main(String[] args) throws SQLException {
        BookCrudOperations bookCrudOperations = new BookCrudOperations();
        System.out.println(bookCrudOperations.findAll());
        System.out.println(bookCrudOperations.saveAll(List.of(new BookModel(
                Double.toString(Math.random()),
                "method bochaire",
                50,
                new java.sql.Date(2000, 1, 1),
                "OTHER"
        ))));
        System.out.println(bookCrudOperations.delete(new BookModel(
                "1",
                "",
                0,
                new Date(0,0,0),
                ""
        )));
    }
}
