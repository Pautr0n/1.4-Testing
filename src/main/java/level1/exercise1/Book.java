package level1.exercise1;

public class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    protected String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.getTitle() + " | " + this.getAuthor() + "\n";
    }

}
