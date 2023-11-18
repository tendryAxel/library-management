package Model;

public class BookModel {
    int id;
    String BookName;
    AuthorModel Author;
    int pageNumber;
    String topic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public AuthorModel getAuthor() {
        return Author;
    }

    public void setAuthor(AuthorModel author) {
        Author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public BookModel(int id, String bookName, AuthorModel author, int pageNumber, String topic) {
        this.id = id;
        BookName = bookName;
        Author = author;
        this.pageNumber = pageNumber;
        this.topic = topic;
    }

    public BookModel(int id, String bookName, int pageNumber, String topic) {
        this.id = id;
        BookName = bookName;
        this.pageNumber = pageNumber;
        this.topic = topic;
    }

    public BookModel() {
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id=" + id +
                ", BookName='" + BookName + '\'' +
                ", Author=" + Author +
                ", pageNumber=" + pageNumber +
                ", topic='" + topic + '\'' +
                '}';
    }
}
