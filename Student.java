//Demonstrates:
//Inheritance (extends User)
//Method Overriding (Polymorphism)
public class Student extends User {

    public Student(int userId, String name) {
        super(userId, name);
    }

    @Override
    public void accessLibrary() {
        System.out.println("Student can issue up to 3 books.");
    }
}

