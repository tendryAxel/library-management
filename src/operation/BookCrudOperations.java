package operation;

import Model.BookModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookCrudOperations implements CrudOperations<BookModel>{

    @Override
    public List<BookModel> findAll() throws SQLException {
        String psql = "SELECT * FROM \"book\";";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<BookModel> result = new ArrayList<>();
        while (resultSet.next()){
            result.add(new BookModel(
                    resultSet.getInt("id"),
                    resultSet.getString("bookname"),
                    resultSet.getInt("pagenumbers"),
                    resultSet.getString("topics")
            ));
        }
        return result;
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
