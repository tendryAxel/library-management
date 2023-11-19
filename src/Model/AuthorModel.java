package Model;

public class AuthorModel {
    String id;
    String Name;
    String Sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public AuthorModel(String id, String name, String sex) {
        this.id = id;
        Name = name;
        Sex = sex;
    }

    public AuthorModel() {
    }

    @Override
    public String toString() {
        return "AuthorModel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                '}';
    }
}
