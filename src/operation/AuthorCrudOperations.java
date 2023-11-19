package operation;

import Model.AuthorModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorCrudOperations implements CrudOperations<AuthorModel>{

    @Override
    public List<AuthorModel> findAll() throws SQLException {
        String psql = "SELECT * FROM \"author\";";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<AuthorModel> result = new ArrayList<>();
        while (resultSet.next()){
            result.add(new AuthorModel(
                    resultSet.getString("id"),
                    resultSet.getString("authorname"),
                    resultSet.getString("sex")
            ));
        }
        return result;
    }

    @Override
    public List<AuthorModel> saveAll(List<AuthorModel> toSave){
        toSave.forEach(author -> {
            try {
                save(author);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        return toSave;
    }

    @Override
    public AuthorModel save(AuthorModel toSave) throws SQLException {
        String psql = "INSERT INTO \"author\" VALUES( ? , ? , ? );";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toSave.getId());
        preparedStatement.setString(2, toSave.getName());
        preparedStatement.setString(3, toSave.getSex());
        preparedStatement.executeUpdate();
        return toSave;
    }

    @Override
    public AuthorModel delete(AuthorModel toDelete) throws SQLException {
        String psql = "DELETE FROM \"author\" WHERE id= ?;";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toDelete.getId());
        preparedStatement.executeUpdate();
        return toDelete;
    }
}
