package Model;

public class SubscribersModel extends UserModel {
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getReference() {
        return super.getReference();
    }

    @Override
    public void setReference(String reference) {
        super.setReference(reference);
    }

    public SubscribersModel(int id, String name, String reference) {
        super(id, name, reference);
    }

    public SubscribersModel() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
