public class Student {

    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display student info
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}
