/*Meaning:
Same action behaves differently in different situations.
There are two types:

(a) Compile-time Polymorphism → Method Overloading
class MathUtil {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

(b) Runtime Polymorphism → Method Overriding */
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); } // overridden
}

class Example {
    public static void main(String[] args) {
        Animal a = new Dog(); // runtime polymorphism
        a.sound();
    }
}
