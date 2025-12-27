//Demonstrates: Abstraction
//Abstract method
//Common structure for users
public abstract class User {
    protected int userId;
    protected String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public abstract void accessLibrary();
}


