package Model;

public class UserModel {
    int id;
    String name;
    String reference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public UserModel(int id, String name, String reference) {
        this.id = id;
        this.name = name;
        this.reference = reference;
    }

    public UserModel() {
    }
}
