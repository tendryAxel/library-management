import Model.AuthorModel;
import Model.BookModel;
import Model.SubscribersModel;
import operation.AuthorCrudOperations;
import operation.BookCrudOperations;
import operation.SubscriberCrudOperations;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApplication {
    public static void main(String[] args) throws SQLException {
        // Creation of crud object
        System.out.println("Creation of crud object");
        SubscriberCrudOperations subscriberCrudOperations = new SubscriberCrudOperations();
        AuthorCrudOperations authorCrudOperations = new AuthorCrudOperations();
        BookCrudOperations bookCrudOperations = new BookCrudOperations();
        System.out.println();

        // View all table
        System.out.println("View all table");
        System.out.println(subscriberCrudOperations.findAll());
        System.out.println(authorCrudOperations.findAll());
        System.out.println(bookCrudOperations.findAll());
        System.out.println();

        // Insert one
        System.out.println("Insert");
        SubscribersModel subscribersModel = new SubscribersModel("44", "hello", "STD22075");
        AuthorModel authorModel = new AuthorModel("44", "Mr Python", "M");
        BookModel bookModel = new BookModel(
                "44",
                "methode bochaire",
                55,
                new Date(2000,1,1),
                "OTHER"
        );

        subscriberCrudOperations.saveAll(List.of(subscribersModel));
        authorCrudOperations.saveAll(List.of(authorModel));
        bookCrudOperations.saveAll(List.of(bookModel));
        System.out.println();

        // View all table
        System.out.println("View all table");
        System.out.println(subscriberCrudOperations.findAll());
        System.out.println(authorCrudOperations.findAll());
        System.out.println(bookCrudOperations.findAll());
        System.out.println();

        // Delete all new data
        System.out.println("Delete");
        subscriberCrudOperations.delete(subscribersModel);
        authorCrudOperations.delete(authorModel);
        bookCrudOperations.delete(bookModel);
        System.out.println();

        // View all table
        System.out.println("View all table");
        System.out.println(subscriberCrudOperations.findAll());
        System.out.println(authorCrudOperations.findAll());
        System.out.println(bookCrudOperations.findAll());
        System.out.println();
    }
}