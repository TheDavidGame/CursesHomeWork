package home7;

public class Visitor {
    private String name;
    private Integer id = null;
    private Book book;


    public void setBook(Book book) {
        this.book = book;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public Integer getId() {
        return id;
    }


    public void borrow(Book book) {
        if (book == null) {
            System.out.println("Такой книги нет");
        } else {
            if (getBook() == null && !book.isBorrowed()) {
                if (getId() == null) { // если он впервые берет книгу
                    setId((int) (Math.random() * 100)); // устанавливаем id, т.к. он впервые
                }
                setBook(book); // отдаем книгу
                book.setBorrowed(true); // книга теперь занята
            } else {
                System.out.println("Книга уже одолжена");
            }
        }
    }

    public Book returnBook() {
        Book book = getBook();
        if (getBook() != null && book.isBorrowed()) {
            book.setBorrowed(false);
            setBook(null);
            return book;
        } else {
            System.out.println("У посетителя нет книги");
            return null;
        }
    }
}
