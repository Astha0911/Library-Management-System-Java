// Handles:

// Add books

// Issue books

// Return books

// Display books
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void showBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println(
                book.getBookId() + " | " +
                book.getTitle() + " | Issued: " +
                book.isIssued()
            );
        }
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return request.");
    }
}

