package Model;

public class BookModel {
    String id;
    String BookName;
    int pageNumber;
    String releaseDate;
    String topic;
    AuthorModel Author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public AuthorModel getAuthor() {
        return Author;
    }

    public void setAuthor(AuthorModel author) {
        Author = author;
    }

    public BookModel(String id, String bookName, int pageNumber, String releaseDate, String topic, AuthorModel author) {
        this.id = id;
        BookName = bookName;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
        this.topic = topic;
        Author = author;
    }

    public BookModel(String id, String bookName, int pageNumber, String releaseDate, String topic) {
        this.id = id;
        BookName = bookName;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
        this.topic = topic;
    }

    public BookModel() {
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id='" + id + '\'' +
                ", BookName='" + BookName + '\'' +
                ", pageNumber=" + pageNumber +
                ", releaseDate='" + releaseDate + '\'' +
                ", topic='" + topic + '\'' +
                ", Author=" + Author +
                '}';
    }
}
