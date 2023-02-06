package home7;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getName().equals(books.get(i).getName())) {
                break;
            } else {
                if (i == books.size() - 1) {
                    books.add(book);
                }
                continue;
            }
        }
    }

    public void deleteBook(String name) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)) {
                books.remove(i);
            }
        }
    }

    public Book returnBookbyName(String name) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)) {
                return books.get(i);
            }
        }
        return null;
    }

    public ArrayList<Book> returnBooksByAuthor(String author) {
        ArrayList<Book> out = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                out.add(books.get(i));
            }
        }
        return out;
    }
}
