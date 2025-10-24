            // Program on constructor in Java
class Student {
    String name;
    int age;
    double fee;

    // Constructor
    Student(String name, int age) {
        // Initializing instance variables
        this.name = name;
        this.age = age;
        this.fee = 30000.0; // Default fee
    }

   public  void displayInfo() {
    // Displaying student information
        System.out.println("Name: " + name + ", Age: " + age + ", Fee: " + fee);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an object of Student class using the constructor
        Student student1 = new Student("nitin", 20);
        Student student2 = new Student("ganesh", 22);
        Student student3 = new Student("rajesh", 21);
        Student student4 = new Student("sai", 23);
        Student student5 = new Student("nagarjun", 24);
        System.out.println("Student Information:");

        // Displaying student information
        student1.displayInfo();
        student2.displayInfo();
    }
}
                    // Program on constructor in Java end....