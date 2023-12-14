import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor to initialize the object
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book [Book Id = " + bookId + ", Book Name = " + bookName + ". Author Name = " + authorName + "]";
    }
}

public class Books {
    public static void main(String[] args) {
        // Creating an ArrayList to store Book
        ArrayList<Book> books = new ArrayList<>();

        // Adding books to the ArrayList
        books.add(new Book(101, "Let Us C", "Yashvant P Kanitkar"));
        books.add(new Book(102, "Head First Java", "Kathy Sierra"));

        // Display book details using enhanced for loop
        System.out.println("-- All Books --");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
