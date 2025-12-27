//Demonstrates:
//Polymorphism (User u = new Student())
//User interaction
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Users (Polymorphism)
        User student = new Student(101, "Astha");
        Librarian librarian = new Librarian();

        student.accessLibrary();
        librarian.accessLibrary();


        // Pre-added books
        library.addBook(new Book(1, "Java Programming"));
        library.addBook(new Book(2, "Data Structures"));
        library.addBook(new Book(3, "Operating Systems"));

        int choice;
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Thank you for using Library System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}

