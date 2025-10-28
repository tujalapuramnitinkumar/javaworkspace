// Constructors in java    
class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " - " + age);
    }
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nitin", 22);
        s1.display();
    }
}
//end....
