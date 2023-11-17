package operation;

import Model.BookModel;

import java.sql.PreparedStatement;
import java.util.List;

public class BookCrudOperations implements CrudOperations<BookModel>{
    @Override
    public List<BookModel> findAll() {
        String psql = "SELECT * FROM \"book\";";
        return null;
    }

    @Override
    public List<BookModel> saveAll(List<BookModel> toSave) {
        return null;
    }

    @Override
    public BookModel save(BookModel toSave) {
        return null;
    }

    @Override
    public BookModel delete(BookModel toDelete) {
        return null;
    }
}
