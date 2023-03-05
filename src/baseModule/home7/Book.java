package home7;

public class Book {
    private String name;
    private String author;
    private boolean borrowed = false;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
