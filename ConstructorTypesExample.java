                // ConstructorTypesExample.java
class employee {
    String name;
    int id;

    // Default constructor
    employee() {
        this.name = name;
        this.id = id;
    }

    // Parameterized constructor
    employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor
    employee(employee emp) {
        this.name = emp.name;
        this.id = emp.id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
public class ConstructorTypesExample {
    public static void main(String[] args) {
        // Using default constructor
        employee emp1 = new employee();
        emp1.display();

        // Using parameterized constructor

        employee emp2 = new employee("Nitin", 101);
        emp2.display();

        employee emp3 = new employee("Ganesh", 102);
        emp3.display();

        // Using copy constructor
        employee emp4 = new employee(emp3);
        emp3.display();
    }
}
                        // Program on constructor in Java end....