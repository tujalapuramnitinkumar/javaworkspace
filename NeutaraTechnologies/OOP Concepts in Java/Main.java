/*🔹 Class:

A class is a blueprint or template that defines the properties (variables) and behaviors (methods).

🔹 Object:

An object is an instance of a class — it represents a real-world entity.

Example: */
class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // object
        s1.id = 101;
        s1.name = "Nitin";
        s1.display();
    }
}

