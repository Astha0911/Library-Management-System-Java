//Librarian Class (Inheritance + Polymorphism)
public class Librarian extends User {

    public Librarian() {
        super(0, "Default Librarian");
    }

    public Librarian(int userId, String name) {
        super(userId, name);
    }

    @Override
    public void accessLibrary() {
        System.out.println("Librarian can add or remove books.");
    }
}
