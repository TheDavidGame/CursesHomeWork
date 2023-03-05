package home7;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Война и мир", "Толстой"));
        books.add(new Book("Мертвые души", "Гоголь"));
        books.add(new Book("Парус", "Лермонтов"));
        Library library = new Library(books);

//        ex1
        library.addBook(new Book("Мцыри", "Лермонтов"));
//        ex2
        library.deleteBook("Мертвые души");
//        ex3
        System.out.println(library.returnBookbyName("Война и мир").getName());
//        ex4
        ArrayList<Book> outBooks = new ArrayList<>(library.returnBooksByAuthor("Лермонтов"));
        for (int i = 0; i < outBooks.size(); i++) {
            System.out.println(outBooks.get(i).getName() + " " + outBooks.get(i).getAuthor());
        }
//        ex5
        Visitor visitor = new Visitor();
        visitor.borrow(library.returnBookbyName("Война и мир"));
        System.out.println(visitor.getBook().isBorrowed());
        Visitor visitor1 = new Visitor();
//        visitor1.borrow(library.returnBookbyName("Война и мир"));
//        System.out.println(visitor1.getBook().isBorrowed()); // тут возвращается null, т.к. нет книги
//        ex6
        visitor.returnBook(); // первый посетитель возвращает книгу
        visitor1.borrow(library.returnBookbyName("Война и мир")); //второй забирает книгу, который вернул первый посетитель
        System.out.println(visitor1.getBook().isBorrowed()); // теперь у второго посетителя она есть

    }
}
