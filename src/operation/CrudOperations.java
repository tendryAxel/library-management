package operation;

import Model.BookModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface CrudOperations<T> {
    List<T> findAll() throws SQLException;
    List<T> saveAll(List<T> toSave) throws SQLException;
    T save(T toSave) throws SQLException;
    T delete(T toDelete) throws SQLException;
}
