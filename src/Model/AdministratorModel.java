package Model;

public class AdministratorModel extends UserModel{
    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
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

    public AdministratorModel(String id, String name, String reference) {
        super(id, name, reference);
    }

    public AdministratorModel() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
