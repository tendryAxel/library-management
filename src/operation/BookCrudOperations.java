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
                    resultSet.getString("id"),
                    resultSet.getString("bookname"),
                    resultSet.getInt("pagenumbers"),
                    resultSet.getString("realeasedate"),
                    resultSet.getString("topics")
            ));
        }
        return result;
    }

    @Override
    public List<BookModel> saveAll(List<BookModel> toSave) throws SQLException {
        return null;
    }

    @Override
    public BookModel save(BookModel toSave) throws SQLException {
        String psql = "INSERT INTO \"book\" VALUES( ? , ? , ? , ? , ? );";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toSave.getId());
        preparedStatement.setString(2, toSave.getBookName());
        preparedStatement.setInt(3, toSave.getPageNumber());
        preparedStatement.setString(4, toSave.getReleaseDate());
        preparedStatement.setString(5, toSave.getTopic());
        ResultSet resultSet = preparedStatement.executeQuery();
        return new BookModel(
                resultSet.getString("id"),
                resultSet.getString("bookname"),
                resultSet.getInt("pagenumbers"),
                resultSet.getString("realeasedate"),
                resultSet.getString("topics")
        );
    }

    @Override
    public BookModel delete(BookModel toDelete) {
        return null;
    }
}
