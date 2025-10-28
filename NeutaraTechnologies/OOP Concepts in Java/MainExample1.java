/*Meaning:Abstraction
Showing only essential features and hiding implementation details using abstract classes or interfaces. */
abstract class Vehicle {
    abstract void start(); // abstract method
    void fuel() { System.out.println("Diesel"); }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}
class MainExample1 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}