package operation;

import Model.SubscribersModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubscriberCrudOperations implements CrudOperations<SubscribersModel>{

    @Override
    public List<SubscribersModel> findAll() throws SQLException {
        String psql = "SELECT * FROM \"subscriber\";";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubscribersModel> result = new ArrayList<>();
        while (resultSet.next()){
            result.add(new SubscribersModel(
                    resultSet.getString("id"),
                    resultSet.getString("subscribername"),
                    resultSet.getString("reference")
            ));
        }
        return result;
    }

    @Override
    public List<SubscribersModel> saveAll(List<SubscribersModel> toSave){
        toSave.forEach(subscriber -> {
            try {
                save(subscriber);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        return toSave;
    }

    @Override
    public SubscribersModel save(SubscribersModel toSave) throws SQLException {
        String psql = "INSERT INTO \"subscriber\" VALUES( ? , ? , ? );";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toSave.getId());
        preparedStatement.setString(2, toSave.getName());
        preparedStatement.setString(3, toSave.getReference());
        preparedStatement.executeUpdate();
        return toSave;
    }

    @Override
    public SubscribersModel delete(SubscribersModel toDelete) throws SQLException {
        String psql = "DELETE FROM \"subscriber\" WHERE id= ?;";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(psql);
        preparedStatement.setString(1, toDelete.getId());
        preparedStatement.executeUpdate();
        return toDelete;
    }
}
