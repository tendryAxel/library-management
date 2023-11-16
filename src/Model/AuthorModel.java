package Model;

public class AuthorModel {
    int id;
    String Name;
    String Sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public AuthorModel(int id, String name, String sex) {
        this.id = id;
        Name = name;
        Sex = sex;
    }

    public AuthorModel() {
    }
}
