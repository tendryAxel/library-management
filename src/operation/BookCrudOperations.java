package operation;

import Model.BookModel;

import java.sql.Date;
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
                    resultSet.getDate("realeasedate"),
                    resultSet.getString("topics")
            ));
        }
        return result;
    }

    @Override
    public List<BookModel> saveAll(List<BookModel> toSave){
        toSave.forEach(book -> {
            try {
                save(book);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        return toSave;
    }

    @Override
    public BookModel save(BookModel toSave) throws SQLException {
        String psql = "INSERT INTO \"book\" VALUES( ? , ? , ? , ? , '"+toSave.getTopic()+"' );";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toSave.getId());
        preparedStatement.setString(2, toSave.getBookName());
        preparedStatement.setInt(3, toSave.getPageNumber());
        preparedStatement.setDate(4, toSave.getReleaseDate());
        preparedStatement.executeUpdate();
        return toSave;
    }

    @Override
    public BookModel delete(BookModel toDelete) throws SQLException {
        String psql = "DELETE FROM \"book\" WHERE id= ?;";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toDelete.getId());
        preparedStatement.executeUpdate();
        return toDelete;
    }
}
