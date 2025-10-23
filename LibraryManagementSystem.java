import java.util.*;

// Book class
class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + id +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Issued=" + isIssued +
                '}';
    }
}

// User class
class User {
    private int userId;
    private String name;
    private List<Book> issuedBooks;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + userId +
                ", Name='" + name + '\'' +
                ", IssuedBooks=" + issuedBooks +
                '}';
    }
}

// Library class
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(Book book, User user) {
        if (book != null && !book.isIssued()) {
            book.issue();
            user.issueBook(book);
            System.out.println(user.getName() + " issued the book: " + book.getTitle());
        } else {
            System.out.println("Book is either not available or already issued.");
        }
    }

    public void returnBook(Book book, User user) {
        if (book != null && book.isIssued()) {
            book.returnBook();
            user.returnBook(book);
            System.out.println(user.getName() + " returned the book: " + book.getTitle());
        } else {
            System.out.println("Book is not issued.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to test the system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to library
        Book b1 = new Book(1, "Java Basics", "Author A");
        Book b2 = new Book(2, "Python Fundamentals", "Author B");
        Book b3 = new Book(3, "Data Structures", "Author C");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Creating users
        User u1 = new User(101, "Alice");
        User u2 = new User(102, "Bob");

        // Display all books
        library.displayBooks();

        // Issue and return books
        library.issueBook(b1, u1); // Alice issues Java Basics
        library.issueBook(b2, u2); // Bob issues Python Fundamentals

        library.displayBooks(); // Check issued status

        library.returnBook(b1, u1); // Alice returns Java Basics
        library.displayBooks(); // Check status again
    }
}
